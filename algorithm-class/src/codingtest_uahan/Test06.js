function solution(totalTicket, logs) {

    let wait = null
    let count = []

    logs
        .map((log) => parse(log))
.forEach(person => {
        if (count.length > totalTicket) {
        return
    }

    if(person[1] === 'request') {
        if (wait && Toseconds(person[2]) - Toseconds(wait[2]) < 60) {
            return
        }

        wait = person
        count = [...count, person[0]]
    }

    if (person[1] === 'leave') {
        if(person[0] === wait[0] && Toseconds(person[2]) - Toseconds(wait[2]) < 60) {
            count.splice(count.findIndex((person) => person === wait[0]), 1)
            wait = null
        }
    }
})
    return count.sort()
}

function parse(arr) {
    return arr.split(" ")
}

function Toseconds (hms) {
    const times = hms.split(':');
    return (+times[0]) * 60 * 60 + (+times[1]) * 60 + (+times[2]);
}