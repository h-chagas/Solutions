import React, { useEffect, useState } from 'react';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import { CartProvider } from './Context/cart-context'
import Header from './Components/Header/Header.jsx'
import Nav from './Components/Nav/Nav.jsx'
import Home from './Pages/Home.jsx';
import Shop from './Pages/Shop.jsx';
import CheckoutPage from './Pages/CheckoutPage.jsx';
import './App.css';

const App = () => {
  const [plantApi, setPlantApi] = useState([]);

  useEffect(() => {
    fetch('https://seed-theory-api.netlify.app/data.json')
    .then((res) => res.json())
    .then((data) => setPlantApi(data))
  }, []);

  return (
  <CartProvider plantApi={plantApi}>
    <BrowserRouter>
      <div>
        <Header />
        <Nav />
        <main>
          <Routes>
            <Route path="/" element={<Home />} />
            <Route path="/shop" element={<Shop  plantApi={plantApi}/>} />
            <Route path="/checkout" element={<CheckoutPage  plantApi={plantApi}/>} />
          </Routes>
        </main>
      </div>
    </BrowserRouter>
    </CartProvider>
   );
}

export default App;

