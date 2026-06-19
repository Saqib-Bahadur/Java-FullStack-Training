import { useParams } from 'react-router-dom'
import { productData } from '../Products';

const ProductList = () => {
  const params = useParams(); // {id:1}
  console.log(params.id); // 1
  const id = params.id === undefined ? undefined : parseInt(params.id); // 1
  const product = productData.find((product) => product.id === id);
  console.log(product); // 1st product details
  return (
    <>
    {
        product === undefined ? (<h1>Unkown Product</h1>) :
        (
            <>
            <h1>{product.name}</h1>
            <h3>Description : {product.description}</h3>
            <h3>Price : {product.price}</h3>
            </>
        )
    }
    </>
  )
}

export default ProductList