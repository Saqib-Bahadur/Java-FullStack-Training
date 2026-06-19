import React from 'react'
import { Link } from 'react-router-dom'
import ProductsList from './ProductsList'


const Header = () => {
  return (
    <div>
        <Link to='products'> Navigate to Products </Link>
    </div>
  )
}

export default Header