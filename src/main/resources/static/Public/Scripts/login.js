document.addEventListener('DOMContentLoaded', () => {
    const loginForm = document.getElementById('loginForm');

    loginForm.addEventListener('submit', function(event) {
        // Impede o envio padrão do formulário (recarregamento da página)
        event.preventDefault();

        // Captura os valores dos campos
        const email = document.getElementById('email').value;
        const password = document.getElementById('password').value;
        const remember = document.getElementById('remember').checked;

        // Validação básica (o HTML5 já faz a maior parte com o atributo 'required')
        if(email === '' || password === '') {
            alert('Por favor, preencha todos os campos.');
            return;
        }

        // Aqui entraria a lógica de integração com o backend (ex: fetch para uma API)
        console.log('Tentativa de Login iniciada...');
        console.log('E-mail:', email);
        console.log('Senha:', '*'.repeat(password.length)); // Escondendo a senha no console
        console.log('Lembrar de mim:', remember);

        // Simulando sucesso no login
        alert(`Login efetuado com sucesso para o e-mail: ${email}`);

        // Limpando os campos após o login
        loginForm.reset();
    });
});