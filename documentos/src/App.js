import React from 'react';
import ReactDOM from 'react-dom/client';
import {useState} from 'react';

function App(){
const [nome, setNome] = useState('');

function saudacao(nomeusuario){
  alert(`Bom dia ${nomeusuario}, seja bem vindo!`);
}

  return(
    <div>
      <h1>Exemplo de parâmetros</h1>

      <input 
        type="text" 
        placeholder='Digite seu nome' 
        onChange={(e) => setNome(e.target.value)} 
      />

      <button onClick={() => saudacao(nome)}>
        Enviar
      </button>
    </div>
  );
}

export default App;