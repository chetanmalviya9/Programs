let object = [
    { "name": "chetan", "age": 22, "group": ["tilak", "laptop"] },
    { "name": "niraj", "age": 32, "group": ["chetan", "lap"] },
    { "name": "nemat", "age": 24, "group": ["til", "laptop"] },
    { "name": "nitesh", "age": 13, "group": ["tila", "laptop"] },
    { "name": "satish", "age": 25, "group": ["lap", "tilak"] },
    { "name": "parul", "age": 12, "group": ["til", "tilak"] },
]

let i = false;
let index = object.findIndex((obj) => {
    for (let key of obj.group) {
        if (key == "tilak") {
            i = true;
        }
        return obj.age==12&&i;
    }
})

console.log(object[5].name)
