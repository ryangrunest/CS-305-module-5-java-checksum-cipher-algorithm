# Checksum Verification: Generate and Display a Hash Value

This project demonstrates how to generate a checksum (hash value) for a unique text string using Java and Spring Boot. The checksum is generated using the `MessageDigest` class and displayed via a RESTful web service.

## Assignment Steps

1. **Download the Code Base**  
   Download the Module Five Coding Assignment Checksum Verification Code Base (see Supporting Materials).

2. **Refactor the Data String**  
   Update the code to use your first and last name as the unique data string.

3. **Generate the Checksum**  
   - Create an object of the `MessageDigest` class from the `java.security` library.
   - Initialize the object with your chosen algorithm (e.g., `SHA-256`).
   - Use the `digest()` method to generate a hash value (byte array) from your unique data string.
   - Convert the hash value to hexadecimal using a helper function.

4. **Create a RESTful Route**  
   - Use the `@RequestMapping` annotation to create a REST endpoint.
   - Return the data string, the name of the cipher algorithm, and the hash value to the browser.

## Example Output

To view the hash, navigate to [https://localhost:8443/hash](https://localhost:8443/hash) in your browser.

**Example input:**  
`Ryan Grunest`

**Example output:**
`4fb047688d6e56a8ec450185768e04b6634128c4302094ee9d9e2151d704db25`