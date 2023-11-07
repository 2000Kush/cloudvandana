let a="Welcome to this Javascript Program"
let x=a.length
var revs=''
for(var i=x-1;i>=0;i--)
{
    revs+=a[i]
}

let b=revs.split("").reverse()
b=b.join(" ")
console.log(b)