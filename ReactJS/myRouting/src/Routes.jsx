import React from "react";
import App from "./App.jsx";
import {
  BrowserRouter,
  createBrowserRouter,
  Route,
  RouterProvider,
} from "react-router-dom";
import ProductsList from "./pages/ProductsList.jsx";
import About from "./pages/About.jsx";
import Header from "./pages/Header.jsx";
import ProductList from "./pages/ProductList.jsx";

const myRoutertree = createBrowserRouter([
  {
    path: "/",
    // element: <App />,
    element : <Header/>
  },
  {
    path: "products",
    element: <ProductsList />,
  },
  {
    path: "about",
    element: <About/>
  },
  {
    // Route Parameters
    // localhost:5173/products/1
    path: "products/:id",
    element: <ProductList/>
  },
]);

const Routes = () => {
  {/* HashBags event that changes browser url */}
  return (
    <>
        <RouterProvider router={myRoutertree}/>
  </>
  )
}

export default Routes
