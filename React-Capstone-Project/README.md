# 📦 Product Inventory Management System

A responsive React-based Product Inventory Management System that allows users to manage products using CRUD operations and a REST API powered by JSON Server.

---

## 🚀 Features

- View all products
- Add new products
- Edit existing products
- Delete products
- Dashboard showing total number of products
- Responsive UI with Tailwind CSS
- API integration using Fetch API
- Routing with React Router DOM
- Environment variables using `.env`
- Local REST API using JSON Server

---

## 🛠 Technologies Used

- React.js
- JavaScript (ES6+)
- Tailwind CSS
- React Router DOM
- JSON Server
- Fetch API
- Vite
- HTML5
- CSS3

---

## 📁 Project Structure

```text
Product Inventory Management System
│
├── public
│    └── favicon.svg
│
├── src
│    ├── Navbar.jsx
│    │      
│    │
│    ├── pages
│    │      Home.jsx
│    │      Products.jsx
│    │      AddProduct.jsx
│    │      EditProduct.jsx
│    │
│    ├── services
│    │      productApi.js
│    │
│    ├── App.jsx
│    └── main.jsx
│
├── db.json
├── .env
├── package.json
├── vite.config.js
└── README.md
```

---

## 📌 React Concepts Covered

### useState()

Used for managing component state such as:

- Product name
- Price
- Quantity
- Category
- Product list

Example:

```javascript
const [products, setProducts] = useState([]);
```

---

### useEffect()

Used for fetching product data when the component loads.

Example:

```javascript
useEffect(() => {
  fetchProducts();
}, []);
```

---

### Props

Props are used to pass data and functions between components.

Examples:

- `products`
- `setProducts`
- `fetchProducts`

---

## 🌐 React Router DOM

Used for page navigation.

### Routes Implemented

| Route | Description |
|---------|------------|
| `/` | Home Page |
| `/products` | Products Page |
| `/add-product` | Add Product Page |
| `/edit-product/:id` | Edit Product Page |

### Concepts Used

- BrowserRouter
- Routes
- Route
- Link
- useNavigate
- useParams

---

## 🔄 CRUD Operations

### Create

Adds a new product.

```http
POST /products
```

---

### Read

Fetches all products.

```http
GET /products
```

---

### Update

Updates existing product information.

```http
PUT /products/:id
```

---

### Delete

Deletes a product.

```http
DELETE /products/:id
```

---

## 🗄 JSON Server

JSON Server is used as a fake REST API backend.

Database file:

```text
db.json
```

### Start JSON Server

```bash
npx json-server --watch db.json --port 3000
```

### API Endpoint

```text
http://localhost:3000/products
```

---

## 🌍 Fetch API

The application communicates with the JSON Server using Fetch API.

### Get Products

```javascript
fetch(API_URL)
```

### Add Product

```javascript
fetch(API_URL, {
  method: "POST"
})
```

### Update Product

```javascript
fetch(`${API_URL}/${id}`, {
  method: "PUT"
})
```

### Delete Product

```javascript
fetch(`${API_URL}/${id}`, {
  method: "DELETE"
})
```

---

## ⚙ Environment Variables

Environment variables are managed using `.env`.

### .env

```env
VITE_API_URL=http://localhost:3000/products
```

Accessed as:

```javascript
import.meta.env.VITE_API_URL
```

---

## 🎨 UI Design

The application uses Tailwind CSS for styling.

### Features

- Responsive layout
- Card-based UI
- Dashboard style design

### UI Resources

UI inspiration and styling ideas were implemented with the help of:

- Tailwind CSS Documentation
- Online resources


---

## 📷 Screenshots

### Home Page

```markdown
![Home Page](./screenshots/home.png)
```

---

### Products Page

```markdown
![Products Page](./screenshots/products.png)
```

---

### Add Product Page

```markdown
![Add Product Page](./screenshots/add-product.png)
```

---

### Edit Product Page

```markdown
![Edit Product Page](./screenshots/edit-product.png)
```

---

## 🔥 How the Project Works

1. JSON Server acts as the backend.
2. Products are stored inside `db.json`.
3. React fetches product data using Fetch API.
4. Product data is managed using `useState()`.
5. `useEffect()` loads products when the application starts.
6. React Router DOM handles page navigation.
7. Users can perform Create, Read, Update, and Delete operations.
8. The UI updates dynamically without reloading the page.

---

## 📚 Learning Outcomes

Through this project, the following concepts were practiced:

- React Components
- Props
- useState Hook
- useEffect Hook
- React Router DOM
- REST APIs
- Fetch API
- JSON Server
- CRUD Operations
- Environment Variables
- Tailwind CSS
- Responsive Design

---

## 🚀 Future Improvements

- Search Products
- Filter by Category
- Sort Products
- Pagination
- Local Storage Support
- Axios Integration
- Express.js Backend
- MongoDB Database
- Authentication using JWT
- Complete MERN Stack Conversion

---

## 👨‍💻 Author

### Saqib

Final Year B.Tech Student

Aspiring Full Stack Developer | MERN Stack Enthusiast

---

## ⭐ Support

If you found this project useful, consider giving it a ⭐ on GitHub!