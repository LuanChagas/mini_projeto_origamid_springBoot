import React from "react";
import "./App.css";
import { BrowserRouter, Route } from "react-router-dom";
import Footer from "./components/Footer/Footer";
import Header from "./components/Header/Header";
import Produtos from "./components/Produtos/Produtos";
import Contato from "./components/Contato/Contato";
import Produto from "./components/Produtos/Produto/Produto";
const App = () => {
  return (
    <div className="App">
      <BrowserRouter>
        <Header />
        <div className="content"></div>
        <Route exact path="/">
          <Produtos />
        </Route>
        <Route path="/produto/:id">
          <Produto />
        </Route>
        <Route path="/contato">
          <Contato />
        </Route>
        <Footer />
      </BrowserRouter>
    </div>
  );
};

export default App;
