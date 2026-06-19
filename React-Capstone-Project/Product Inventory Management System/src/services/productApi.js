const API_URL = import.meta.env.VITE_API_URL;

// GET
export async function getProducts() {
    const response = await fetch(API_URL);
    return response.json();
}

// POST
export async function addProduct(product) {
    return fetch(API_URL, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(product)
    });
}

// DELETE
export async function deleteProduct(id) {
    return fetch(`${API_URL}/${id}`, {
        method: "DELETE"
    });
}

// PUT
export async function updateProduct(id, product) {
    return fetch(`${API_URL}/${id}`, {
        method: "PUT",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(product)
    });
}

// GET ONE PRODUCT
export async function getProductById(id) {
    const response = await fetch(`${API_URL}/${id}`);
    return response.json();
}