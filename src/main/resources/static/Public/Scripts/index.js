document.addEventListener('DOMContentLoaded', () => {
    const flightSearchForm = document.getElementById('flightSearchForm');

    flightSearchForm.addEventListener('submit', function(event) {
        // Previne o recarregamento da página ao clicar em Buscar
        event.preventDefault();

        // Captura os valores que o usuário digitou
        const fromValue = document.getElementById('from').value;
        const toValue = document.getElementById('to').value;
        const dateValue = document.getElementById('date').value;
        const passengersValue = document.getElementById('passengers').value;

        // Validação simples
        if (!fromValue || !toValue || !dateValue) {
            alert("Por favor, preencha a origem, destino e data.");
            return;
        }

        // Simulação do envio da busca
        console.log("--- Iniciando Busca de Voo ---");
        console.log("Origem:", fromValue);
        console.log("Destino:", toValue);
        console.log("Data:", dateValue);
        console.log("Detalhes:", passengersValue);

        alert(`Buscando voos de ${fromValue} para ${toValue} na data ${dateValue}...`);

        // Aqui você faria o fetch/integração com sua API/Servidor
    });
});