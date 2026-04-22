/*
 * auth-header.js
 *
 * Gerencia a exibição dinâmica do cabeçalho de autenticação em todas as páginas.
 * Verifica se há um usuário logado (armazenado no localStorage) e exibe
 * uma saudação com botão de logout ou o link para login/cadastro, conforme o estado.
 * O logout remove apenas a sessão atual e o carrinho, mantendo o histórico de reservas.
 */

document.addEventListener('DOMContentLoaded', () => {
    // ---------- VERIFICAÇÃO DO CONTAINER ----------
    const authArea = document.getElementById('authHeaderArea');
    if (!authArea) return;

    // ---------- LEITURA DO USUÁRIO LOGADO ----------
    const usuario = JSON.parse(localStorage.getItem('usuarioMeuVoo'));

    // ---------- DETECÇÃO DO CAMINHO (RAIZ OU PUBLIC/) ----------
    const isInPublicFolder = window.location.pathname.includes('/Public/');
    const loginPath = isInPublicFolder ? 'login.html' : 'Public/login.html';

    // ---------- RENDERIZAÇÃO CONDICIONAL ----------
    if (usuario && usuario.nome) {
        authArea.innerHTML = `
            <span class="user-greeting">Olá, ${usuario.nome.split(' ')[0]}</span>
            <button class="btn-logout" id="btnLogout">Sair</button>
        `;
        document.getElementById('btnLogout').addEventListener('click', (e) => {
            e.preventDefault();
            // Remove apenas a sessão e o carrinho (dados temporários)
            localStorage.removeItem('usuarioMeuVoo');
            localStorage.removeItem('carrinhoMeuVoo');
            // O histórico de reservas permanece salvo para quando o usuário fizer login novamente
            window.location.href = isInPublicFolder ? '../index.html' : 'index.html';
        });
    } else {
        authArea.innerHTML = `
            <a href="${loginPath}" class="btn-login">Entrar / Cadastrar</a>
        `;
    }
});