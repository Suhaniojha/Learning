let username = "JackOfAllTrades";
let userCheck = /^[A-Za-z]([0-9]{2,}|[A-Za-z]+\d*)$/; // Change this line
let result = userCheck.test(username);