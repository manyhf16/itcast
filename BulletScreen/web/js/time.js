function currentTime() {
    let d = new Date();
    return d.getFullYear() + "-" + fillZ(d.getMonth() + 1) + "-" + fillZ(d.getDate()) + " " +
        fillZ(d.getHours()) + ":" + fillZ(d.getMinutes()) + ":" + fillZ(d.getSeconds());
}

function fillZ(n) {
    return n < 10 ? "0" + n : n;
}