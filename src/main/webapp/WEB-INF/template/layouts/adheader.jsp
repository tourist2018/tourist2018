
<!-- top navigation -->
<div class="top_nav">
	<div class="nav_menu">
		<nav>
			<ul class="nav nav-pills">
				<li class="active"><a class="nav-link" href="/home">Home</a></li>
				<li class="nav-item"><a class="nav-link"
					onclick="document.forms['logoutForm'].submit()" href="/logout">Logout</a></li>
			</ul>
		</nav>
	</div>
	<tiles:insertAttribute name="body" />
</div>

<!-- /top navigation -->