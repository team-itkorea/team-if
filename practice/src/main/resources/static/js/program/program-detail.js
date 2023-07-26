let programCode = location.pathname.substring(location.pathname.lastIndexOf("/") + 1)

load("/program/")

function load(uri) {
	$.ajax({
		async: false,
		type: "get",
		url: uri + programCode,
		dataType: "json",
		success: (response) => {
			
		},
		error: (error) => {
			console.log(error)
		}
	})
}

function getProgram(program) {
	const programTheme = document.querySelector(".")
	const programTitle
	const programPrice
	const programInfo
	const programLike
	const programPlace
	const programSchedule
	const programTime
	const programDate
	const programTheme
	const programTheme
	
	
	
}