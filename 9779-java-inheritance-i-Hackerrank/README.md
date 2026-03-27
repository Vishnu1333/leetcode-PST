# [Java Inheritance I](https://www.hackerrank.com/challenges/java-inheritance-1/problem)
## Easy
<div class="challenge-body-html"><div class="challenge_problem_statement"><div class="msB challenge_problem_statement_body"><div class="hackdown-content"><svg style="display: none;"><defs id="MathJax_SVG_glyphs"></defs></svg><p>Using <em>inheritance</em>, one class can acquire the properties of others. Consider the following <em>Animal</em> class:</p>

<div class="highlight"><pre><span class="kd">class</span> <span class="nc">Animal</span><span class="o">{</span>
    <span class="kt">void</span> <span class="nf">walk</span><span class="o">(){</span>
        <span class="n">System</span><span class="o">.</span><span class="na">out</span><span class="o">.</span><span class="na">println</span><span class="o">(</span><span class="s">"I am walking"</span><span class="o">);</span>
    <span class="o">}</span>
<span class="o">}</span>
</pre></div>


<p>This class has only one method, <em>walk</em>. Next, we want to create a <em>Bird</em> class that also has a <em>fly</em> method. We do this using <em>extends</em> keyword:</p>

<div class="highlight"><pre><span class="kd">class</span> <span class="nc">Bird</span> <span class="kd">extends</span> <span class="n">Animal</span> <span class="o">{</span>
    <span class="kt">void</span> <span class="nf">fly</span><span class="o">()</span> <span class="o">{</span>
        <span class="n">System</span><span class="o">.</span><span class="na">out</span><span class="o">.</span><span class="na">println</span><span class="o">(</span><span class="s">"I am flying"</span><span class="o">);</span>
    <span class="o">}</span>
<span class="o">}</span>
</pre></div>


<p>Finally, we can create a Bird object that can both <em>fly</em> and <em>walk</em>.</p>

<div class="highlight"><pre><span class="kd">public</span> <span class="kd">class</span> <span class="nc">Solution</span><span class="o">{</span>
   <span class="kd">public</span> <span class="kd">static</span> <span class="kt">void</span> <span class="nf">main</span><span class="o">(</span><span class="n">String</span><span class="o">[]</span> <span class="n">args</span><span class="o">){</span>

      <span class="n">Bird</span> <span class="n">bird</span> <span class="o">=</span> <span class="k">new</span> <span class="n">Bird</span><span class="o">();</span>
      <span class="n">bird</span><span class="o">.</span><span class="na">walk</span><span class="o">();</span>
      <span class="n">bird</span><span class="o">.</span><span class="na">fly</span><span class="o">();</span>
   <span class="o">}</span>
<span class="o">}</span>
</pre></div>


<p>The above code will print:</p>

<pre><code>I am walking
I am flying
</code></pre>

<p>This means that a Bird object has all the properties that an Animal object has, as well as some additional unique properties.</p>

<p>The code above is provided for you in your editor. You must add a <em>sing</em> method to the <em>Bird</em> class, then modify the <em>main</em> method accordingly so that the code prints the following lines:</p>

<pre><code>I am walking
I am flying
I am singing
</code></pre></div></div></div></div>