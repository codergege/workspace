/**
 * Directory
 * ***************** BASIC ***************************
 * getStyle(obj,attr) 获取元素的 attr 样式
 * -- getParentWidth(obj) 获取元素父级容器的宽
 * -- getParentHeight(obj) 获取元素父级容器的高
 * 	如果父级没有宽高怎么解决, 有没有现成的库, 父级是 body 怎么获取屏幕宽高
 * getRootPath() 获取项目路径
 * getProjectName() 获取项目名称
 * 
 * ***************** MOVEMENT ************************
 * function doMove(obj, attr, step, boundary, speed, callback) 运动函数
 *  @param {Object} obj 目标元素
 *  @param {Object} attr 样式名称, 比如位置的 left, top; 宽高的 width, height
 *  @param {Object} step 每次变化的步长
 *  @param {Object} boundary 边界值
 *  @param {Object} speed 单位毫秒
 *  @param {Object} callback 回调函数	
 * 
 * 
 * 
 */

/**
 * getStyle(obj, attr)
 * 获取 obj 的 attr 样式
 */
function getStyle(obj, attr) {
	return obj.currentStyle ? obj.currentStyle[attr] : getComputedStyle(obj)[attr];
}

/**
 * 获取项目地址
 */
function getRootPath() {
	//获取当前网址，如： http://localhost:8088/jquery/easyui/login.jsp
	var curWwwPath = window.document.location.href;
	//获取主机地址之后的目录，如： jquery/easyui/login.jsp
	var pathName = window.document.location.pathname;
	var pos = curWwwPath.indexOf(pathName);
	//获取主机地址，如： http://localhost:8088
	var localhostPath = curWwwPath.substring(0, pos);
	//获取带"/"的项目名，如：/jquery
	var projectName = pathName.substring(0, pathName.substr(1).indexOf('/') + 1);
	return(localhostPath + projectName);
}

function getProjectName() {
	var pathName = window.document.location.pathname;
	var projectName = pathName.substring(1, pathName.substr(1).indexOf('/') + 1);
	return projectName;
}

///***************** MOVEMENT ************************
/**
 * 
 * @param {Object} obj 目标元素
 * @param {Object} attr 样式名称, 比如位置的 left, top; 宽高的 width, height
 * @param {Object} step 每次变化的步长
 * @param {Object} boundary 
 * @param {Object} speed 单位毫秒
 * @param {Object} callback 回调函数
 */
function doMove(obj, attr, step, boundary, speed, callback) {
	var cur = parseInt(getStyle(obj, attr));
	step = cur < boundary ? step : -step;
	clearInterval(obj.timer);
	obj.timer = setInterval(function() {
		cur += step;
		if(step > 0 && cur > boundary || step < 0 && cur < boundary) {
			cur = boundary;
		}
		obj.style[attr] = cur + 'px';
		if(cur == boundary) {
			clearInterval(obj.timer);
			callback();
		}
	}, speed);
}