//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Williams_Vix_Fix
// ID_model: UBER_1Min_1WIL_24e3eb67 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UBER_1Min_1WIL_24e3eb67", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UBER_1Min_24e3eb67(rangeLow, wvf, Color_con1, midLine, sDev, colInt, upperBand, rangeHigh, lowerBand, Color_con2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( Color_con1 <= -0.415615 )
		if( wvf <= 0.207966 )
			if( Color_con2 <= -1.68933 )
				if( Color_con2 <= -2.57957 )
					if( sDev <= 0.412434 )
						ret := 0.666667
					if( sDev > 0.412434 )
						ret := 1.000000 // buy
				if( Color_con2 > -2.57957 )
					if( lowerBand <= 0.060797 )
						if( wvf <= 0.036259 )
							ret := -0.562500
						if( wvf > 0.036259 )
							if( sDev <= 1.48872 )
								if( Color_con2 <= -1.8171 )
									ret := 0.240000
								if( Color_con2 > -1.8171 )
									ret := 0.864407 // buy
							if( sDev > 1.48872 )
								if( midLine <= 1.11219 )
									ret := -0.428571
								if( midLine > 1.11219 )
									ret := 0.777778 // buy
					if( lowerBand > 0.060797 )
						ret := -0.578947
			if( Color_con2 > -1.68933 )
				if( wvf <= 0.011705 )
					if( lowerBand <= -0.184375 )
						if( upperBand <= 0.548856 )
							if( sDev <= 0.346546 )
								ret := -1.000000 // sell
							if( sDev > 0.346546 )
								if( midLine <= 0.149691 )
									ret := -0.600000
								if( midLine > 0.149691 )
									ret := -0.882353 // sell
						if( upperBand > 0.548856 )
							if( lowerBand <= -0.220859 )
								if( midLine <= 0.16249 )
									ret := 0.020408
								if( midLine > 0.16249 )
									ret := -0.401575
							if( lowerBand > -0.220859 )
								if( sDev <= 0.543116 )
									ret := -0.909091 // sell
								if( sDev > 0.543116 )
									ret := -0.200000
					if( lowerBand > -0.184375 )
						if( upperBand <= 0.626306 )
							if( midLine <= 0.242987 )
								if( lowerBand <= -0.043627 )
									ret := -0.218638
								if( lowerBand > -0.043627 )
									ret := 0.764706 // buy
							if( midLine > 0.242987 )
								if( sDev <= 0.266203 )
									ret := -0.909091 // sell
								if( sDev > 0.266203 )
									ret := -0.722222 // sell
						if( upperBand > 0.626306 )
							if( Color_con2 <= -0.515369 )
								if( wvf <= 0.001748 )
									ret := -0.130435
								if( wvf > 0.001748 )
									ret := -0.700000 // sell
							if( Color_con2 > -0.515369 )
								if( Color_con1 <= -0.658282 )
									ret := 0.206349
								if( Color_con1 > -0.658282 )
									ret := 0.900000 // buy
				if( wvf > 0.011705 )
					if( Color_con1 <= -0.814688 )
						if( sDev <= 1.18127 )
							if( upperBand <= 1.59736 )
								if( sDev <= 0.771814 )
									ret := 0.076837
								if( sDev > 0.771814 )
									ret := -0.417344
							if( upperBand > 1.59736 )
								if( lowerBand <= 0.258766 )
									ret := 0.157143
								if( lowerBand > 0.258766 )
									ret := 0.611111
						if( sDev > 1.18127 )
							if( Color_con2 <= -1.43935 )
								if( wvf <= 0.124812 )
									ret := -0.750000 // sell
								if( wvf > 0.124812 )
									ret := -0.960000 // sell
							if( Color_con2 > -1.43935 )
								if( midLine <= 0.743022 )
									ret := -0.952381 // sell
								if( midLine > 0.743022 )
									ret := -0.296296
					if( Color_con1 > -0.814688 )
						if( lowerBand <= -0.291793 )
							if( sDev <= 0.566304 )
								if( sDev <= 0.466039 )
									ret := 0.954545 // buy
								if( sDev > 0.466039 )
									ret := 0.323232
							if( sDev > 0.566304 )
								if( sDev <= 0.58259 )
									ret := -0.933333 // sell
								if( sDev > 0.58259 )
									ret := -0.176471
						if( lowerBand > -0.291793 )
							if( Color_con2 <= -0.265153 )
								if( midLine <= 0.209448 )
									ret := 0.046404
								if( midLine > 0.209448 )
									ret := -0.156849
							if( Color_con2 > -0.265153 )
								if( wvf <= 0.177373 )
									ret := -0.328094
								if( wvf > 0.177373 )
									ret := -0.553398
		if( wvf > 0.207966 )
			if( Color_con2 <= -1.14848 )
				if( wvf <= 0.749385 )
					if( wvf <= 0.672875 )
						if( Color_con1 <= -0.548075 )
							if( sDev <= 0.556722 )
								if( lowerBand <= 0.018997 )
									ret := -0.695652
								if( lowerBand > 0.018997 )
									ret := 0.442857
							if( sDev > 0.556722 )
								if( Color_con1 <= -3.49555 )
									ret := -0.633803
								if( Color_con1 > -3.49555 )
									ret := -0.234624
						if( Color_con1 > -0.548075 )
							if( sDev <= 0.259028 )
								ret := -0.956522 // sell
							if( sDev > 0.259028 )
								if( sDev <= 0.288899 )
									ret := -0.315789
								if( sDev > 0.288899 )
									ret := -0.753247 // sell
					if( wvf > 0.672875 )
						if( wvf <= 0.718982 )
							if( Color_con1 <= -1.29691 )
								if( lowerBand <= 0.4552 )
									ret := -0.692308
								if( lowerBand > 0.4552 )
									ret := -1.000000 // sell
							if( Color_con1 > -1.29691 )
								ret := -0.400000
						if( wvf > 0.718982 )
							if( lowerBand <= 0.241626 )
								ret := -0.500000
							if( lowerBand > 0.241626 )
								ret := -0.333333
				if( wvf > 0.749385 )
					if( sDev <= 7.42573 )
						if( wvf <= 1.47232 )
							if( upperBand <= 3.10383 )
								if( Color_con2 <= -1.38763 )
									ret := 0.107692
								if( Color_con2 > -1.38763 )
									ret := -0.526316
							if( upperBand > 3.10383 )
								if( Color_con2 <= -3.55679 )
									ret := -0.347826
								if( Color_con2 > -3.55679 )
									ret := 0.459677
						if( wvf > 1.47232 )
							if( Color_con1 <= -4.24225 )
								ret := -1.000000 // sell
							if( Color_con1 > -4.24225 )
								if( Color_con1 <= -3.44767 )
									ret := 0.058824
								if( Color_con1 > -3.44767 )
									ret := -0.782609 // sell
					if( sDev > 7.42573 )
						if( midLine <= 6.75882 )
							ret := 1.000000 // buy
						if( midLine > 6.75882 )
							ret := 0.600000
			if( Color_con2 > -1.14848 )
				if( upperBand <= 4.23927 )
					if( Color_con2 <= 0.123737 )
						if( midLine <= 1.1533 )
							if( wvf <= 0.925354 )
								if( Color_con1 <= -1.75234 )
									ret := 0.841270 // buy
								if( Color_con1 > -1.75234 )
									ret := 0.046838
							if( wvf > 0.925354 )
								if( sDev <= 1.31551 )
									ret := 0.315036
								if( sDev > 1.31551 )
									ret := -0.666667
						if( midLine > 1.1533 )
							if( sDev <= 0.57782 )
								if( midLine <= 1.53723 )
									ret := -0.545788
								if( midLine > 1.53723 )
									ret := 0.180723
							if( sDev > 0.57782 )
								if( lowerBand <= 0.542858 )
									ret := -0.410989
								if( lowerBand > 0.542858 )
									ret := 0.138889
					if( Color_con2 > 0.123737 )
						if( sDev <= 1.1556 )
							if( lowerBand <= -0.332741 )
								if( lowerBand <= -0.371692 )
									ret := -0.937500 // sell
								if( lowerBand > -0.371692 )
									ret := -0.394737
							if( lowerBand > -0.332741 )
								if( Color_con1 <= -0.523895 )
									ret := 0.746835 // buy
								if( Color_con1 > -0.523895 )
									ret := -0.015152
						if( sDev > 1.1556 )
							if( midLine <= 1.46965 )
								if( midLine <= 0.830997 )
									ret := -0.785714 // sell
								if( midLine > 0.830997 )
									ret := 0.019900
							if( midLine > 1.46965 )
								if( Color_con2 <= 0.936662 )
									ret := -0.880000 // sell
								if( Color_con2 > 0.936662 )
									ret := 0.526316
				if( upperBand > 4.23927 )
					if( Color_con2 <= -0.91463 )
						ret := 0.200000
					if( Color_con2 > -0.91463 )
						if( Color_con2 <= 5.64913 )
							if( colInt <= 0.5 )
								if( Color_con2 <= -0.375632 )
									ret := 0.961538 // buy
								if( Color_con2 > -0.375632 )
									ret := 0.437500
							if( colInt > 0.5 )
								if( lowerBand <= -1.42016 )
									ret := 0.894737 // buy
								if( lowerBand > -1.42016 )
									ret := 1.000000 // buy
						if( Color_con2 > 5.64913 )
							ret := 0.230769
	if( Color_con1 > -0.415615 )
		if( wvf <= 0.272531 )
			if( wvf <= 0.026051 )
				if( Color_con1 <= -0.357805 )
					if( Color_con1 <= -0.359322 )
						if( lowerBand <= -0.085931 )
							if( Color_con2 <= -0.397607 )
								if( Color_con2 <= -0.513729 )
									ret := -0.416667
								if( Color_con2 > -0.513729 )
									ret := -0.928571 // sell
							if( Color_con2 > -0.397607 )
								if( Color_con1 <= -0.387393 )
									ret := 0.288889
								if( Color_con1 > -0.387393 )
									ret := 0.672131
						if( lowerBand > -0.085931 )
							if( midLine <= 0.150713 )
								ret := 0.666667
							if( midLine > 0.150713 )
								if( midLine <= 0.165928 )
									ret := -0.540541
								if( midLine > 0.165928 )
									ret := 0.054795
					if( Color_con1 > -0.359322 )
						ret := 0.923077 // buy
				if( Color_con1 > -0.357805 )
					if( upperBand <= 0.055835 )
						if( Color_con2 <= -0.082579 )
							ret := 0.666667
						if( Color_con2 > -0.082579 )
							if( wvf <= 0.011499 )
								ret := 0.833333 // buy
							if( wvf > 0.011499 )
								ret := 1.000000 // buy
					if( upperBand > 0.055835 )
						if( lowerBand <= -0.028875 )
							if( midLine <= 0.020793 )
								if( lowerBand <= -0.044127 )
									ret := -0.666667
								if( lowerBand > -0.044127 )
									ret := -0.960000 // sell
							if( midLine > 0.020793 )
								if( lowerBand <= -0.136748 )
									ret := -0.619048
								if( lowerBand > -0.136748 )
									ret := -0.187380
						if( lowerBand > -0.028875 )
							if( Color_con2 <= -0.238342 )
								if( upperBand <= 0.145031 )
									ret := 0.060976
								if( upperBand > 0.145031 )
									ret := -0.295775
							if( Color_con2 > -0.238342 )
								if( midLine <= 0.037889 )
									ret := 0.312500
								if( midLine > 0.037889 )
									ret := 0.005747
			if( wvf > 0.026051 )
				if( midLine <= 0.390167 )
					if( sDev <= 0.319735 )
						if( midLine <= 0.042738 )
							if( lowerBand <= 0.001984 )
								if( Color_con2 <= -0.16551 )
									ret := -0.210526
								if( Color_con2 > -0.16551 )
									ret := 0.406250
							if( lowerBand > 0.001984 )
								if( sDev <= 0.033553 )
									ret := 0.000000
								if( sDev > 0.033553 )
									ret := -0.312500
						if( midLine > 0.042738 )
							if( lowerBand <= -0.051746 )
								if( Color_con1 <= -0.187144 )
									ret := -0.004618
								if( Color_con1 > -0.187144 )
									ret := 0.207504
							if( lowerBand > -0.051746 )
								if( midLine <= 0.215925 )
									ret := -0.030999
								if( midLine > 0.215925 )
									ret := 0.039038
					if( sDev > 0.319735 )
						if( wvf <= 0.261964 )
							if( sDev <= 0.412196 )
								if( Color_con2 <= -0.067391 )
									ret := -0.085828
								if( Color_con2 > -0.067391 )
									ret := -0.572464
							if( sDev > 0.412196 )
								if( Color_con1 <= -0.377094 )
									ret := -0.600000
								if( Color_con1 > -0.377094 )
									ret := -1.000000 // sell
						if( wvf > 0.261964 )
							if( lowerBand <= -0.124923 )
								if( Color_con2 <= -0.089102 )
									ret := 0.538462
								if( Color_con2 > -0.089102 )
									ret := 0.906250 // buy
							if( lowerBand > -0.124923 )
								if( midLine <= 0.2423 )
									ret := -0.636364
								if( midLine > 0.2423 )
									ret := -0.052632
				if( midLine > 0.390167 )
					if( lowerBand <= 0.250769 )
						if( sDev <= 0.200673 )
							if( midLine <= 0.412572 )
								if( lowerBand <= 0.21949 )
									ret := 1.000000 // buy
								if( lowerBand > 0.21949 )
									ret := 0.571429
							if( midLine > 0.412572 )
								ret := 0.388889
						if( sDev > 0.200673 )
							if( sDev <= 0.213451 )
								ret := -0.055556
							if( sDev > 0.213451 )
								if( upperBand <= 0.675385 )
									ret := 0.785714 // buy
								if( upperBand > 0.675385 )
									ret := 0.230769
					if( lowerBand > 0.250769 )
						if( wvf <= 0.252483 )
							ret := 0.214286
						if( wvf > 0.252483 )
							if( midLine <= 0.41837 )
								ret := -0.538462
							if( midLine > 0.41837 )
								ret := -0.111111
		if( wvf > 0.272531 )
			if( Color_con2 <= -0.807387 )
				if( upperBand <= 1.38382 )
					if( Color_con2 <= -2.09592 )
						if( upperBand <= 0.892874 )
							if( wvf <= 0.405005 )
								ret := -1.000000 // sell
							if( wvf > 0.405005 )
								if( Color_con2 <= -2.42651 )
									ret := -0.409091
								if( Color_con2 > -2.42651 )
									ret := -0.794872 // sell
						if( upperBand > 0.892874 )
							ret := 0.111111
					if( Color_con2 > -2.09592 )
						if( lowerBand <= 0.039372 )
							if( midLine <= 0.34528 )
								if( Color_con2 <= -1.30696 )
									ret := 0.016949
								if( Color_con2 > -1.30696 )
									ret := -0.448052
							if( midLine > 0.34528 )
								if( lowerBand <= -0.014955 )
									ret := -0.484848
								if( lowerBand > -0.014955 )
									ret := -0.871795 // sell
						if( lowerBand > 0.039372 )
							if( Color_con2 <= -1.76758 )
								if( sDev <= 0.22416 )
									ret := 0.933333 // buy
								if( sDev > 0.22416 )
									ret := 0.500000
							if( Color_con2 > -1.76758 )
								if( midLine <= 0.616682 )
									ret := 0.114537
								if( midLine > 0.616682 )
									ret := -0.822222 // sell
				if( upperBand > 1.38382 )
					if( midLine <= 0.78783 )
						ret := 0.800000 // buy
					if( midLine > 0.78783 )
						ret := 0.923077 // buy
			if( Color_con2 > -0.807387 )
				if( midLine <= 1.09272 )
					if( lowerBand <= -0.042834 )
						if( colInt <= 0.5 )
							if( midLine <= 0.313175 )
								if( sDev <= 0.391506 )
									ret := 0.072998
								if( sDev > 0.391506 )
									ret := 0.419162
							if( midLine > 0.313175 )
								if( Color_con2 <= -0.011885 )
									ret := 0.378223
								if( Color_con2 > -0.011885 )
									ret := -0.322581
						if( colInt > 0.5 )
							if( upperBand <= 2.15765 )
								if( lowerBand <= -0.57818 )
									ret := -0.631313
								if( lowerBand > -0.57818 )
									ret := 0.093665
							if( upperBand > 2.15765 )
								if( Color_con2 <= 0.93365 )
									ret := -0.044444
								if( Color_con2 > 0.93365 )
									ret := 0.613095
					if( lowerBand > -0.042834 )
						if( Color_con2 <= 0.134427 )
							if( Color_con1 <= -0.059469 )
								if( Color_con2 <= -0.436172 )
									ret := 0.238245
								if( Color_con2 > -0.436172 )
									ret := 0.028992
							if( Color_con1 > -0.059469 )
								if( lowerBand <= 0.089641 )
									ret := -0.027728
								if( lowerBand > 0.089641 )
									ret := -0.202029
						if( Color_con2 > 0.134427 )
							if( upperBand <= 1.81096 )
								if( sDev <= 0.639536 )
									ret := 0.130536
								if( sDev > 0.639536 )
									ret := -0.157534
							if( upperBand > 1.81096 )
								if( Color_con1 <= -0.326863 )
									ret := 1.000000 // buy
								if( Color_con1 > -0.326863 )
									ret := 0.500000
				if( midLine > 1.09272 )
					if( lowerBand <= 1.02329 )
						if( Color_con2 <= 0.176094 )
							if( sDev <= 0.55028 )
								if( wvf <= 1.07508 )
									ret := 0.230769
								if( wvf > 1.07508 )
									ret := -0.673575
							if( sDev > 0.55028 )
								if( midLine <= 1.23687 )
									ret := 0.888889 // buy
								if( midLine > 1.23687 )
									ret := -0.473684
						if( Color_con2 > 0.176094 )
							if( lowerBand <= 0.830913 )
								if( lowerBand <= 0.110198 )
									ret := 0.133333
								if( lowerBand > 0.110198 )
									ret := -0.352941
							if( lowerBand > 0.830913 )
								ret := 0.708333 // buy
					if( lowerBand > 1.02329 )
						if( Color_con1 <= -0.283792 )
							ret := 0.272727
						if( Color_con1 > -0.283792 )
							if( wvf <= 2.27412 )
								if( wvf <= 1.66868 )
									ret := 0.928571 // buy
								if( wvf > 1.66868 )
									ret := 1.000000 // buy
							if( wvf > 2.27412 )
								ret := 0.615385
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Williams_Vix_Fix 
//@version=5
//indicator "CM_Williams_Vix_Fix", overlay=false)

// Inputs
pd = input.int(22, title="LookBack Period Standard Deviation High")
bbl = input.int(20, title="Bollinger Band Length")
mult = input.float(2.0, minval=1, maxval=5, title="Bollinger Band Standard Deviation Up")
lb = input.int(50, title="Look Back Period Percentile High")
ph = input.float(0.85, title="Highest Percentile - 0.90=90%, 0.95=95%, 0.99=99%")
pl = input.float(1.01, title="Lowest Percentile - 1.10=90%, 1.05=95%, 1.01=99%")
hp = input.bool(false, title="Show High Range - Based on Percentile and LookBack Period?")
sd = input.bool(false, title="Show Standard Deviation Line?")

// Calculations
wvf = ((ta.highest(close, pd) - low) / ta.highest(close, pd)) * 100

sDev = mult * ta.stdev(wvf, bbl)
midLine = ta.sma(wvf, bbl)
lowerBand = midLine - sDev
upperBand = midLine + sDev

rangeHigh = ta.highest(wvf, lb) * ph
rangeLow = ta.lowest(wvf, lb) * pl


Color_con1 = wvf - upperBand
Color_con2 = wvf - rangeHigh
// Color condition
col = wvf >= upperBand or wvf >= rangeHigh ? color.lime : color.gray
colInt = wvf >= upperBand or wvf >= rangeHigh ? 1 : 0 //Bool to int

// Plots
plot(hp and na(rangeHigh) ? na : rangeHigh, title="Range High Percentile", color=color.orange, linewidth=4)
plot(hp and na(rangeLow) ? na : rangeLow, title="Range Low Percentile", color=color.orange, linewidth=4)
plot(wvf, title="Williams Vix Fix", color=col, style=plot.style_histogram, linewidth=4)
plot(sd and na(upperBand) ? na : upperBand, title="Upper Band", color=color.aqua, linewidth=3)

// EXPLANATION OF THE STRATEGY
//The provided Pine Script implements a trading strategy that includes stop loss (SL) and multiple take profit (TP) levels,
//with an option to activate a trailing stop at the third TP level. Here's a detailed breakdown of its components and functionality:

//Variables Initialization:
var float stop = na
var float limit1 = na
var float limit2 = na

// Converts a percentage to points based on the average position price and the minimum tick size.
percent2points(percent) =>
    strategy.position_avg_price * percent / 100 / syminfo.mintick

// Stop Loss and Take Profit Inputs:
//Defines inputs for stop loss and three take profit levels in percentage terms.
sl = percent2points(input(2.92, title="stop loss %%"))
tp1 = percent2points(input(1.12, title="take profit 1 %%"))
tp2 = percent2points(input(2.31, title="take profit 2 %%"))
tp3 = percent2points(input(3.91, title="take profit 3 %%"))
activateTrailingOnThirdStep = input(false,title="activate trailing on third stage (tp3 is amount, tp2 is offset level)")
log.info("Stop Loss (sl):", sl," Take Profit 1 (tp1):", tp1, " Take Profit 2 (tp2):", tp2," Take Profit 3 (tp3):", tp3)

// Current Profit Calculation:
//Calculates the current profit in points based on the position size and price.
curProfitInPts() =>
    if strategy.position_size > 0
        (high - strategy.position_avg_price) / syminfo.mintick
    else if strategy.position_size < 0
        (strategy.position_avg_price - low) / syminfo.mintick
    else
        0
// Stop Loss and Profit Target Price Calculations:
//Determines the stop loss and profit target prices based on the position size and offset points.
calcStopLossPrice(OffsetPts) =>
    if strategy.position_size > 0
        strategy.position_avg_price - OffsetPts * syminfo.mintick
    else if strategy.position_size < 0
        strategy.position_avg_price + OffsetPts * syminfo.mintick
    else
        0
calcProfitTrgtPrice(OffsetPts) =>
    calcStopLossPrice(-OffsetPts)
// Current Stage Determination:
//Determines the current stage of the trade based on the profit points reached.
getCurrentStage() =>
    var stage = 0
    if strategy.position_size == 0
        stage := 0
    if stage == 0 and strategy.position_size != 0
        stage := 1
    else if stage == 1 and curProfitInPts() >= tp1
        stage := 2
    else if stage == 2 and curProfitInPts() >= tp2
        stage := 3
    stage
stopLevel = -1.
profitLevel = calcProfitTrgtPrice(tp3)

log.info("Stop Level:", stopLevel)
log.info("Profit Level:", profitLevel)
//This part of the strategy sets up exit conditions based on the current stage of the trade and uses the same exit ID "x" to modify the exit parameters dynamically.
//The exit parameters include stop loss, take profit, and comments for each stage.
// based on current stage set up exit
// note: we use same exit ids ("x") consciously, for MODIFY the exit's parameters
curStage = getCurrentStage()
float op_operation = decision_tree_0_UBER_1Min_24e3eb67(rangeLow, wvf, Color_con1, midLine, sDev, colInt, upperBand, rangeHigh, lowerBand, Color_con2)

log.info("Decision Tree Operation (op_operation):", op_operation)
if (op_operation <= 0)
    if curStage == 1
        stopLevel := calcStopLossPrice(sl)
        strategy.exit("x", loss = sl, profit = tp3, comment = "sl or tp3")
    else if curStage == 2
        stopLevel := calcStopLossPrice(0)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "breakeven or tp3")
    else if curStage == 3
        stopLevel := calcStopLossPrice(-tp1)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "tp1 or tp3")
    else
        strategy.cancel("x")


//SIGNAL MANAGE    User Adjustments and Risk Management
// The user can adjust the threshold values for op_operation to control the level of risk they are willing to take:
// Lower op_operation Threshold for Buy Signal (e.g., 0.5 instead of 0.55):
//     Effect: Generates more buy signals, increasing the frequency of trades. This is suitable for a user willing to take more risks and potentially capture more trading opportunities.
// Higher op_operation Threshold for Buy Signal (e.g., 0.8 instead of 0.55):
//     Effect: Generates fewer buy signals, reducing the frequency of trades. This is suitable for a user seeking to take fewer risks and only enter trades under more favorable conditions.
// Lower op_operation Threshold for Signal Closure (e.g., -0.8 instead of -0.9):
//     Effect: Closes positions less frequently, allowing trades more room to recover from temporary unfavorable conditions. This increases risk but can capture larger gains if the market reverses favorably.
// Higher op_operation Threshold for Signal Closure (e.g., -0.95 instead of -0.9):
//     Effect: Closes positions more frequently, exiting trades quickly at the first sign of unfavorable conditions. This decreases risk but may result in missed opportunities for recovery.
//Signal BUY
FIXED_DOLLAR_AMOUNT  = 10000
positionSize = FIXED_DOLLAR_AMOUNT / close
log.info("Position Size (in dollars $",FIXED_DOLLAR_AMOUNT,"):", positionSize)

if (op_operation >= 0.55)
    stop := close * 0.965
    limit1 := close * 1.03
    limit2 := close * 1.02
    strategy.entry("x", strategy.long, qty=positionSize, stop=stop, comment="in")
//Signal SELL
if (op_operation <= -0.9)
    strategy.close("x", comment = "under Le1")

// Impact on the Dataset
//Stop Loss (SL): Limits the maximum loss by exiting the position if the price moves against the trade by a specified percentage.
//Take Profit (TP1, TP2, TP3): Defines profit-taking levels to secure gains at different stages.
//Trailing Stop: Optionally activates a trailing stop at the third TP level to lock in profits while allowing for further gains if the price continues to move favorably.
//Position Entry and Exit: The strategy's buy and sell signals determine when to enter and exit positions, influencing the dataset by marking the points of trade execution and closure.
//Current Stage Tracking: Monitors the trade's progress through predefined stages, adjusting stop and profit levels accordingly.
//This strategy is designed to manage risk and maximize profits through a structured approach, incorporating multiple exit levels and dynamic adjustments based on market conditions. The dataset will reflect these actions, showing entries, exits, stop loss activations, and profit-taking events, providing valuable information for backtesting and performance analysis.
//Random forest AI offers significant advantages in trading, including the ability to handle large data sets, reduce overfitting and provide more robust predictions through the aggregation of multiple decision trees.

// NOTE: While the Tuisku team stands behind the quality and effectiveness of this trading strategy,
// PLEASE be aware that there is NO GUARANTEE of specific results or profits. TRADING INVOLVES SIGNIFICANT RISK, and it is important to use this strategy with careful consideration of your financial situation and risk tolerance.
// For further information and support, please contact us at Tuisku.eu.


