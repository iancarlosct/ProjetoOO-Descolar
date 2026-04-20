document.addEventListener('DOMContentLoaded', () => {
    const urlParams = new URLSearchParams(window.location.search);
    const localizador = urlParams.get('localizador');
    if (!localizador) {
        alert('Localizador não informado.');
        window.location.href = 'minhas-viagens.html';
        return;
    }

    const usuarioLogado = JSON.parse(localStorage.getItem('usuarioMeuVoo'));
    if (!usuarioLogado) {
        alert('Faça login para acessar o simulador.');
        window.location.href = 'login.html';
        return;
    }

    const chaveHistorico = `historicoReservas_${usuarioLogado.id}`;
    const historico = JSON.parse(localStorage.getItem(chaveHistorico)) || [];
    const reserva = historico.find(r => r.localizador === localizador);
    if (!reserva) {
        alert('Reserva não encontrada.');
        window.location.href = 'minhas-viagens.html';
        return;
    }

    if (reserva.status !== 'Confirmada') {
        alert('Esta reserva não está mais confirmada e não pode ser reembolsada.');
        window.location.href = 'minhas-viagens.html';
        return;
    }

    const siglaParaCidade = {
        'GRU': 'São Paulo', 'CGH': 'São Paulo (Congonhas)', 'GIG': 'Rio de Janeiro',
        'BSB': 'Brasília', 'SSA': 'Salvador', 'REC': 'Recife', 'FOR': 'Fortaleza',
        'CNF': 'Belo Horizonte', 'CWB': 'Curitiba', 'POA': 'Porto Alegre',
        'MAO': 'Manaus', 'SCL': 'Santiago', 'EZE': 'Buenos Aires', 'MIA': 'Miami',
        'JFK': 'Nova York', 'LIS': 'Lisboa', 'LHR': 'Londres', 'CDG': 'Paris'
    };
    const obterNomeCidade = sigla => siglaParaCidade[sigla] || sigla;

    const detalhesDiv = document.getElementById('detalhesReserva');
    detalhesDiv.innerHTML = `
        <h3>Reserva ${reserva.localizador}</h3>
        <p><strong>${obterNomeCidade(reserva.from)} → ${obterNomeCidade(reserva.to)}</strong><br>
        ${new Date(reserva.date).toLocaleDateString('pt-BR')} • ${reserva.airline} • ${reserva.flightClass === 'ECONOMICA' ? 'Econômica' : 'Executiva'}<br>
        Valor total pago: ${reserva.totalPrice.toLocaleString('pt-BR', { style: 'currency', currency: 'BRL' })}</p>
    `;

    const hoje = new Date();
    const dataVoo = new Date(reserva.date);
    const diffDias = Math.ceil((dataVoo - hoje) / (1000 * 60 * 60 * 24));

    let percentualReembolso = 0;
    let descricao = '';

    if (diffDias >= 7) {
        percentualReembolso = 0.90;
        descricao = 'Cancelamento com mais de 7 dias de antecedência: 90% de reembolso.';
    } else if (diffDias >= 2) {
        percentualReembolso = 0.50;
        descricao = 'Cancelamento entre 2 e 7 dias de antecedência: 50% de reembolso.';
    } else if (diffDias >= 0) {
        percentualReembolso = 0.0;
        descricao = 'Cancelamento com menos de 2 dias de antecedência: sem reembolso.';
    } else {
        percentualReembolso = 0.0;
        descricao = 'O voo já ocorreu. Não há reembolso.';
    }

    const valorReembolso = reserva.totalPrice * percentualReembolso;

    document.getElementById('valorReembolso').textContent = valorReembolso.toLocaleString('pt-BR', { style: 'currency', currency: 'BRL' });
    document.getElementById('detalheCalculo').textContent = `${descricao} (${(percentualReembolso * 100).toFixed(0)}% do valor total)`;
    document.getElementById('simulacaoReembolso').style.display = 'block';

    document.getElementById('btnCancelarReembolso').addEventListener('click', () => {
        window.location.href = 'minhas-viagens.html';
    });

    document.getElementById('btnConfirmarReembolso').addEventListener('click', () => {
        if (percentualReembolso === 0) {
            alert('Não há valor a ser reembolsado. Deseja cancelar a reserva mesmo assim?');
        }
        if (confirm(`Confirmar cancelamento e reembolso de ${valorReembolso.toLocaleString('pt-BR', { style: 'currency', currency: 'BRL' })}?`)) {
            reserva.status = 'Cancelada';
            reserva.valorReembolsado = valorReembolso;
            localStorage.setItem(chaveHistorico, JSON.stringify(historico));
            alert('Reserva cancelada com sucesso. O valor será estornado em até 7 dias úteis.');
            window.location.href = 'minhas-viagens.html';
        }
    });
});