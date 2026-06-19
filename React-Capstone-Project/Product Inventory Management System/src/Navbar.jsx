import { Link } from "react-router-dom";

function Navbar() {
  return (
    <nav className="bg-slate-900 shadow-lg">
      <div className="max-w-7xl mx-auto px-6">
        <div className="flex justify-between items-center h-16">

          {/* Logo */}
          <Link
            to="/"
            className="text-2xl font-bold text-white"
          >
            InventoryMS
          </Link>

          {/* Navigation Links */}
          <div className="flex items-center gap-6">

            <Link
              to="/"
              className="text-gray-300 hover:text-white transition duration-300"
            >
              Home
            </Link>

            <Link
              to="/products"
              className="text-gray-300 hover:text-white transition duration-300"
            >
              Products
            </Link>

            <Link
              to="/add-product"
              className="bg-blue-600 hover:bg-blue-700 text-white px-4 py-2 rounded-lg shadow transition duration-300"
            >
              + Add Product
            </Link>

          </div>

        </div>
      </div>
    </nav>
  );
}

export default Navbar;