import React, { useEffect, useState } from 'react';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import Header from './Components/Header/Header.jsx'
import Nav from './Components/Nav/Nav.jsx'
import Home from './Pages/Home.jsx';
import Shop from './Pages/Shop.jsx';
import './App.css';

const App = () => {
  const [plantApi, setPlantApi] = useState([]);

  useEffect(() => {
    fetch('https://seed-theory-api.netlify.app/data.json')
    .then((res) => res.json())
    .then((data) => setPlantApi(data))
  }, []);

  return (
    <BrowserRouter>
      <div>
        <Header />
        <Nav />
        <main>
          <Routes>
            <Route path="/" element={<Home />} />
            <Route path="/shop" element={<Shop  plantApi={plantApi}/>} />
          </Routes>
        </main>
      </div>
    </BrowserRouter>
   );
}

export default App;

