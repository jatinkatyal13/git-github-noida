const myTodos = ['Abhishek' , 'Rajan','john cena']

// console.log(myTodos.indexOf('rajan'))

const newTodos = [{
    title:'Abhishek',
    isDone: false,
},{
    title:'Rajan',
    isDone: false,
},{
    title:'john cena',
    isDone: true,
}]

// const index = newTodos.findIndex(function(todos,index){
//     console.log(todos)

//     return todos.isDone === true
// })

// console.log(index)


// Method 1

// const findTodo = function(myTodos,title){
//     const index = myTodos.findIndex(function(todo,index){
//         return todo.title.toLowerCase() === title.toLowerCase() 
//     })
//     return  myTodos[index]
// }

// let printValue = findTodo(newTodos,'rajan')

// console.log(printValue)

// Method 2
const findTodo = function(myTodos,title){

    const titleReturned = myTodos.find(function(todo,index){
        return todo.title.toLowerCase() === title.toLowerCase() 
    })
    return titleReturned
}

let printValue = findTodo(newTodos,'rajan')

console.log(printValue)