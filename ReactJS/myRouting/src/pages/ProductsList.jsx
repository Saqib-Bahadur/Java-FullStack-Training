import React from 'react'
import { productData } from '../Products'

const ProductsList = () => {
  return (
    <div>
      <h2> Here Are Some Products</h2>
      <ul>
      {productData.map((e)=>(
        <li>{e.id} | {e.name} | {e.description} | {e.price}</li>
      ))}
      </ul>
    </div>
  )
}

export default ProductsList