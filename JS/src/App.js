import logo from "./logo.svg";
import "./App.css";
import Navbar from "./components/Navbar";
import ProductList from "./components/ProductList.js";
import React, { useState } from "react";

function App() {
  const products = [
    { name: "OppoF29 pro", price: 30000, quantity: 0 },
    { name: "Vivo", price: 32000, quantity: 0 },
  ];

  let [productList, setProductList] = useState(products);

  const increamentQuantity = (index) => {
    let newProductList = [...productList];
    console.log(newProductList);
    newProductList[index].quantity++;
    setProductList(newProductList);
  };
  // const decreamentQuantity = (index) => {
  //   //let newProductList = [...productList];
  //   console.log(newProductList);
  //   newProductList[index].quantity--;
  //   setProductList(newProductList);
  // };

  return (
    <>
      <Navbar />
      <main className="container mt-5">
        <ProductList
          productList={productList}
          increamentQuantity={increamentQuantity}
          // decreamentQuantity={decreamentQuantity}
        />
      </main>

      {/* <Fotter/> */}
    </>
  );
}

export default App;
