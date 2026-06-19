import { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import { getProductById, updateProduct } from "../services/productApi";

function EditProduct({ fetchProducts }) {

  const { id } = useParams();
  const navigate = useNavigate();

  const [name, setName] = useState("");
  const [price, setPrice] = useState("");
  const [quantity, setQuantity] = useState("");
  const [category, setCategory] = useState("");

  useEffect(() => {

    async function fetchProduct() {

      const product = await getProductById(id);

      setName(product.name);
      setPrice(product.price);
      setQuantity(product.quantity);
      setCategory(product.category);

    }

    fetchProduct();

  }, [id]);

  async function handleSubmit(e) {
  e.preventDefault();

  const updatedProduct = {
    id: Number(id),
    name,
    price,
    quantity,
    category,
  };
await updateProduct(id, updatedProduct);

await fetchProducts();

navigate("/");
}

  return (
    <div className="min-h-screen bg-slate-100 flex items-center justify-center p-6">

      <div className="bg-white w-full max-w-xl rounded-2xl shadow-xl p-8">

        <div className="mb-8">
          <h1 className="text-4xl font-bold text-slate-800">
            Edit Product
          </h1>

          <p className="text-gray-500 mt-2">
            Update the product information.
          </p>
        </div>

        <form onSubmit={handleSubmit} className="space-y-5">

          <div>
            <label className="block mb-2 font-medium text-gray-700">
              Product Name
            </label>

            <input
              type="text"
              value={name}
              onChange={(e) => setName(e.target.value)}
              className="w-full border border-gray-300 rounded-xl px-4 py-3 outline-none focus:ring-2 focus:ring-amber-500"
              required
            />
          </div>

          <div>
            <label className="block mb-2 font-medium text-gray-700">
              Price
            </label>

            <input
              type="number"
              value={price}
              onChange={(e) => setPrice(e.target.value)}
              className="w-full border border-gray-300 rounded-xl px-4 py-3 outline-none focus:ring-2 focus:ring-amber-500"
              required
            />
          </div>

          <div>
            <label className="block mb-2 font-medium text-gray-700">
              Quantity
            </label>

            <input
              type="number"
              value={quantity}
              onChange={(e) => setQuantity(e.target.value)}
              className="w-full border border-gray-300 rounded-xl px-4 py-3 outline-none focus:ring-2 focus:ring-amber-500"
              required
            />
          </div>

          <div>
            <label className="block mb-2 font-medium text-gray-700">
              Category
            </label>

            <select
              value={category}
              onChange={(e) => setCategory(e.target.value)}
              className="w-full border border-gray-300 rounded-xl px-4 py-3 outline-none focus:ring-2 focus:ring-amber-500"
              required
            >
              <option value="Electronics">Electronics</option>
              <option value="Clothing">Clothing</option>
              <option value="Books">Books</option>
              <option value="Home">Home</option>
              <option value="Food">Food</option>
            </select>
          </div>

          <div className="flex gap-4 pt-4">

            <button
              type="submit"
              className="flex-1 bg-amber-500 hover:bg-amber-600 text-white py-3 rounded-xl shadow-lg transition"
            >
              Update Product
            </button>

            <button
              type="button"
              onClick={() => navigate("/")}
              className="flex-1 bg-gray-500 hover:bg-gray-600 text-white py-3 rounded-xl shadow-lg transition"
            >
              Cancel
            </button>

          </div>

        </form>

      </div>

    </div>
  );
}

export default EditProduct;