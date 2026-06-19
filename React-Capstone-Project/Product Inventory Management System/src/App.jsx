
import { BrowserRouter, Route, Routes } from 'react-router-dom'
import Navbar from './Navbar'
import { useEffect, useState } from 'react'
import Home from './pages/Home'
import Products from './pages/Products'
import AddProduct from './pages/AddProduct'
import EditProduct from './pages/EditProduct'
import { getProducts } from './services/productApi'

function App() {
   const [products, setProducts] = useState([]);

 async function fetchProducts() {
  const data = await getProducts();
  setProducts(data);
}

useEffect(() => {
  fetchProducts();
}, []);


  return (
    <>
     <BrowserRouter>
     <Navbar/>
      <Routes>

        <Route path="/" element={<Home fetchProducts={fetchProducts} products={products}/>} />

        <Route path="/products" element={<Products fetchProducts={fetchProducts} products={products}/>} />

        <Route path="/add-product" element={<AddProduct fetchProducts={fetchProducts}  />} />

        <Route path="/edit-product/:id" element={<EditProduct fetchProducts={fetchProducts} />} />

      </Routes>
    </BrowserRouter>
    </>
  )
}

export default App
