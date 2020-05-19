# GitHub Pages

- GitHub Pages: https://pages.github.com/

# Themes and customization

- Primer Jekyll theme: https://www.rubydoc.info/gems/jekyll-theme-primer
- Eliminating repo header on pages: 
	- https://github.community/t5/GitHub-Pages/Page-not-showing-the-theme/td-p/5545
	- https://stackoverflow.com/questions/46375765/how-do-you-remove-header-on-github-pages/
	- https://github.com/pages-themes/primer/issues/21
	- *Note that this must be done within the directory where pages is serving from (master or /docs).*

# GitHub Pages + Canvas

- First resource found: https://community.canvaslms.com/thread/7640

In the Master 2210 Canvas course, embed an iframe that links to the appropriate GitHub Pages resource.

```html
<iframe src="https://hendrtd.github.io/comp-2210/modules/m0/welcome.html" width="100%" height="600"></iframe>
```

Include Canvas Design Tools extras as desired.

```html
<div id="kl_wrapper_3" class="kl_box_left kl_wrapper">&nbsp;</div>
<p>&nbsp;</p>
<p class="kl_module_progress_icons" style="display: none;">Icon Progress Bar/Navigation (built in browser, hidden in app)</p>
<p>&nbsp;</p>
```

Here is an example full page:

```html
<p><iframe src="https://hendrtd.github.io/comp-2210/modules/m0/welcome.html" width="100%" height="600"></iframe></p>
<div id="kl_wrapper_3" class="kl_box_left kl_wrapper">&nbsp;</div>
<p>&nbsp;</p>
<p class="kl_module_progress_icons" style="display: none;">Icon Progress Bar/Navigation (built in browser, hidden in app)</p>
<p>&nbsp;</p>
```
