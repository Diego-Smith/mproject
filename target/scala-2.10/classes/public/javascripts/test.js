(function (app) {
		
		function init() {
		
		window.highlight = function highlight(x) { alert (x); }
		}
    function create(elt) { return window.document.createElement(elt); }

    function SpeedOMeter (config) {
        this.maxVal = config.maxVal;
        this.unit = config.unit ? config.unit + " " : "";
        this.name = config.name;
        this.container = config.container;
        this.elt = create("div");
        this.elt.className = "monitor";

        var title = create("span");
        title.innerHTML = this.name;
        title.className = 'title';
        this.elt.appendChild(title);

        this.screenCurrent = create("span");
        this.screenCurrent.className = 'screen current';
        this.elt.appendChild(this.screenCurrent);

        this.screenMax = create("span");
        this.screenMax.className = 'screen max';
        this.screenMax.innerHTML = this.maxVal + this.unit;
        this.elt.appendChild(this.screenMax);

        this.needle = create("div");
        this.needle.className = "needle";
        this.elt.appendChild(this.needle);

        this.light = create("div");
        this.light.className = "green light";
        this.elt.appendChild(this.light);

        var wheel = create("div");
        wheel.className = "wheel";
        this.elt.appendChild(wheel);

        this.container.appendChild(this.elt);
    }

    

})(window.App);
