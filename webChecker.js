let userName = 'akshay123'
let password = '123494231'

let userChecker = function(user){
    if((user.includes(123)) && (user.length > 6)){
        return true
    } else {
        return false
    }
}


let passChecker = function(pass){
    if((pass.includes(94)) && (pass.length > 8)){
        return true
    } else {
        return false
    }
}

console.log(userChecker(userName))
console.log(passChecker(password))