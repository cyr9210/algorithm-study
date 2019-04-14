function solution(pobi, crong){
    if(pobi[1] - pobi[0] !== 1 || crong[1] - crong[0] !== 1) {
        return -1
    }
    const pobiMax = max(pobi)
    const crongMax = max(crong)

    return pobiMax === crongMax ? 0 : pobiMax > crongMax ? 1 : 2
}

function max (arr) {
    const left = arr[0].toString().split("")
    const right = arr[1].toString().split("")

    return Math.max(sum(left), sum(right), multi(left), multi(right))
}

function sum (arr) {
    let sum = 0
    for(let i = 0; i < arr.length; i += 1){
        sum += parseInt(arr[i], 10)
    }
    return sum
}

function multi(arr) {
    let multi = 1
    for(let i = 0; i < arr.length; i += 1){
        multi *= parseInt(arr[i], 10)
    }
    return multi
}