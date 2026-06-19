import { Link } from "react-router-dom";
import { deleteProduct } from "../services/productApi";

function Products({ fetchProducts ,products }) {

  async function handleDelete(id) {

  await deleteProduct(id);

  await fetchProducts();

}

  return (
    <div className="min-h-screen bg-slate-100 p-6">

      {/* Header */}
      <div className="max-w-7xl mx-auto flex flex-col md:flex-row justify-between items-center gap-4 mb-8">

        <div>
          <h1 className="text-4xl font-bold text-slate-800">
            All Products
          </h1>

          <p className="text-gray-500 mt-2">
            Manage your inventory products
          </p>
        </div>

      </div>

      {/* Product Cards */}
      <div className="max-w-7xl mx-auto grid gap-6 sm:grid-cols-2 lg:grid-cols-3">

        {products.map((product) => (
          <div
            key={product.id}
            className="bg-white rounded-2xl shadow-md hover:shadow-xl transition p-6"
          >

            <h2 className="text-2xl font-bold text-slate-800 mb-4">
              {product.name}
            </h2>

            <div className="space-y-2 text-gray-600">

              <p>
                <span className="font-semibold">
                  Price:
                </span>{" "}
                ₹{product.price}
              </p>

              <p>
                <span className="font-semibold">
                  Quantity:
                </span>{" "}
                {product.quantity}
              </p>

              <p>
                <span className="font-semibold">
                  Category:
                </span>{" "}
                {product.category}
              </p>

            </div>

            {/* Buttons */}
            <div className="flex gap-3 mt-6">

              <Link
                to={`/edit-product/${product.id}`}
                className="flex-1"
              >
                <button className="w-full bg-amber-500 hover:bg-amber-600 text-white py-2 rounded-lg transition">
                  Edit
                </button>
              </Link>

              <button
                onClick={() => handleDelete(product.id)}
                className="flex-1 bg-red-500 hover:bg-red-600 text-white py-2 rounded-lg transition"
              >
                Delete
              </button>

            </div>

          </div>
        ))}

      </div>

      {/* Empty State */}
      {products.length === 0 && (
        <div className="text-center mt-20">
          <h2 className="text-2xl text-gray-500">
            No Products Available
          </h2>
        </div>
      )}

    </div>
  );
}

export default Products;