import React from 'react';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import Header from './Components/Header/Header.jsx'
import Nav from './Components/Nav/Nav.jsx'
import Home from './Pages/Home.jsx';
import Shop from './Pages/Shop.jsx';
import './App.css';

const App = () => {
  return (
    <BrowserRouter>
      <div>
        <Header />
        <Nav />
        <main>
          <Routes>
            <Route path="/" element={<Home />} />
            <Route path="/shop" element={<Shop />} />
          </Routes>
        </main>
      </div>
    </BrowserRouter>
   );
}

export default App;

