//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Williams_Vix_Fix
// ID_model: SOLUSDT_15Min_1WIL_2295aa8f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SOLUSDT_15Min_1WIL_2295aa8f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SOLUSDT_15Min_2295aa8f(Color_con1, Color_con2, colInt, rangeHigh, midLine, sDev, rangeLow, upperBand, lowerBand, wvf)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( wvf <= 6.18881 )
		if( Color_con1 <= -12.533 )
			if( sDev <= 8.71139 )
				if( Color_con1 <= -13.9833 )
					if( Color_con2 <= -8.4645 )
						if( midLine <= 8.67883 )
							ret := 0.500000
						if( midLine > 8.67883 )
							ret := 1.000000 // buy
					if( Color_con2 > -8.4645 )
						ret := 0.000000
				if( Color_con1 > -13.9833 )
					if( wvf <= 2.84291 )
						if( wvf <= 0.910604 )
							if( wvf <= 0.856814 )
								ret := -0.833333 // sell
							if( wvf > 0.856814 )
								ret := 0.000000
						if( wvf > 0.910604 )
							if( midLine <= 6.66646 )
								ret := -0.750000 // sell
							if( midLine > 6.66646 )
								ret := -1.000000 // sell
					if( wvf > 2.84291 )
						ret := 0.000000
			if( sDev > 8.71139 )
				if( midLine <= 21.2466 )
					if( Color_con2 <= -16.0064 )
						if( midLine <= 8.92274 )
							ret := -0.750000 // sell
						if( midLine > 8.92274 )
							ret := -1.000000 // sell
					if( Color_con2 > -16.0064 )
						if( upperBand <= 23.6406 )
							if( sDev <= 8.90917 )
								ret := -0.500000
							if( sDev > 8.90917 )
								if( wvf <= 1.64166 )
									ret := -0.500000
								if( wvf > 1.64166 )
									ret := -0.937500 // sell
						if( upperBand > 23.6406 )
							if( sDev <= 13.3896 )
								if( wvf <= 2.97696 )
									ret := 0.714286 // buy
								if( wvf > 2.97696 )
									ret := -0.250000
							if( sDev > 13.3896 )
								if( wvf <= 5.2763 )
									ret := -1.000000 // sell
								if( wvf > 5.2763 )
									ret := -0.500000
				if( midLine > 21.2466 )
					ret := 1.000000 // buy
		if( Color_con1 > -12.533 )
			if( wvf <= 2.28572 )
				if( midLine <= 0.656732 )
					if( Color_con1 <= -0.627061 )
						if( Color_con1 <= -0.842399 )
							if( Color_con2 <= -0.888803 )
								if( upperBand <= 1.09606 )
									ret := 0.397727
								if( upperBand > 1.09606 )
									ret := 0.115321
							if( Color_con2 > -0.888803 )
								if( Color_con2 <= -0.686247 )
									ret := -0.074286
								if( Color_con2 > -0.686247 )
									ret := 0.129870
						if( Color_con1 > -0.842399 )
							if( Color_con2 <= -0.246576 )
								if( upperBand <= 1.20448 )
									ret := 0.190751
								if( upperBand > 1.20448 )
									ret := 0.320755
							if( Color_con2 > -0.246576 )
								if( wvf <= 0.484982 )
									ret := -0.454545
								if( wvf > 0.484982 )
									ret := -0.062500
					if( Color_con1 > -0.627061 )
						if( lowerBand <= 0.253789 )
							if( Color_con2 <= -7.00109 )
								if( upperBand <= 0.924542 )
									ret := 0.892857 // buy
								if( upperBand > 0.924542 )
									ret := 0.000000
							if( Color_con2 > -7.00109 )
								if( upperBand <= 1.06115 )
									ret := 0.079130
								if( upperBand > 1.06115 )
									ret := 0.012327
						if( lowerBand > 0.253789 )
							if( Color_con2 <= -1.05754 )
								if( midLine <= 0.52121 )
									ret := 0.000000
								if( midLine > 0.52121 )
									ret := 0.782609 // buy
							if( Color_con2 > -1.05754 )
								if( lowerBand <= 0.304535 )
									ret := 0.343511
								if( lowerBand > 0.304535 )
									ret := 0.031250
				if( midLine > 0.656732 )
					if( upperBand <= 2.33066 )
						if( wvf <= 0.564324 )
							if( midLine <= 1.3452 )
								if( upperBand <= 1.33311 )
									ret := 0.146667
								if( upperBand > 1.33311 )
									ret := 0.036424
							if( midLine > 1.3452 )
								if( sDev <= 0.913747 )
									ret := -0.528302
								if( sDev > 0.913747 )
									ret := 0.400000
						if( wvf > 0.564324 )
							if( sDev <= 1.10121 )
								if( lowerBand <= 0.057449 )
									ret := 0.031210
								if( lowerBand > 0.057449 )
									ret := -0.023497
							if( sDev > 1.10121 )
								if( Color_con2 <= 0.217111 )
									ret := -0.144324
								if( Color_con2 > 0.217111 )
									ret := 0.095890
					if( upperBand > 2.33066 )
						if( Color_con2 <= -9.33568 )
							if( midLine <= 1.71624 )
								ret := -0.833333 // sell
							if( midLine > 1.71624 )
								if( Color_con2 <= -17.2927 )
									ret := -1.000000 // sell
								if( Color_con2 > -17.2927 )
									ret := 0.584746
						if( Color_con2 > -9.33568 )
							if( Color_con1 <= -10.6844 )
								if( Color_con2 <= -6.96506 )
									ret := 0.530612
								if( Color_con2 > -6.96506 )
									ret := -0.363636
							if( Color_con1 > -10.6844 )
								if( sDev <= 0.869978 )
									ret := 0.172035
								if( sDev > 0.869978 )
									ret := 0.032677
			if( wvf > 2.28572 )
				if( lowerBand <= -0.913114 )
					if( Color_con1 <= 0.563986 )
						if( wvf <= 4.55697 )
							if( upperBand <= 3.42087 )
								if( wvf <= 2.50339 )
									ret := 0.250000
								if( wvf > 2.50339 )
									ret := -0.545455
							if( upperBand > 3.42087 )
								if( upperBand <= 5.86895 )
									ret := 0.234375
								if( upperBand > 5.86895 )
									ret := -0.032895
						if( wvf > 4.55697 )
							if( midLine <= 2.48291 )
								if( Color_con2 <= 1.06532 )
									ret := 0.346154
								if( Color_con2 > 1.06532 )
									ret := -0.423358
							if( midLine > 2.48291 )
								if( Color_con1 <= -1.98056 )
									ret := -0.167939
								if( Color_con1 > -1.98056 )
									ret := 0.291667
					if( Color_con1 > 0.563986 )
						if( upperBand <= 3.09326 )
							if( lowerBand <= -1.0368 )
								ret := 0.250000
							if( lowerBand > -1.0368 )
								ret := 0.800000 // buy
						if( upperBand > 3.09326 )
							if( lowerBand <= -0.931157 )
								if( midLine <= 1.61342 )
									ret := -0.794872 // sell
								if( midLine > 1.61342 )
									ret := -0.575000
							if( lowerBand > -0.931157 )
								if( Color_con2 <= 3.19214 )
									ret := -0.555556
								if( Color_con2 > 3.19214 )
									ret := 0.600000
				if( lowerBand > -0.913114 )
					if( Color_con2 <= 2.71284 )
						if( Color_con1 <= 0.898359 )
							if( Color_con1 <= -10.1335 )
								if( upperBand <= 16.4473 )
									ret := -0.538462
								if( upperBand > 16.4473 )
									ret := 0.750000 // buy
							if( Color_con1 > -10.1335 )
								if( upperBand <= 11.515 )
									ret := 0.078119
								if( upperBand > 11.515 )
									ret := 0.349112
						if( Color_con1 > 0.898359 )
							if( Color_con1 <= 1.45046 )
								if( Color_con2 <= 1.01025 )
									ret := 0.185185
								if( Color_con2 > 1.01025 )
									ret := -0.374233
							if( Color_con1 > 1.45046 )
								ret := 0.666667
					if( Color_con2 > 2.71284 )
						if( wvf <= 5.15659 )
							if( sDev <= 1.8032 )
								ret := 0.000000
							if( sDev > 1.8032 )
								if( sDev <= 2.88054 )
									ret := 0.878049 // buy
								if( sDev > 2.88054 )
									ret := 0.250000
						if( wvf > 5.15659 )
							if( lowerBand <= -0.147938 )
								if( sDev <= 2.24691 )
									ret := 1.000000 // buy
								if( sDev > 2.24691 )
									ret := 0.276190
							if( lowerBand > -0.147938 )
								if( Color_con2 <= 2.95708 )
									ret := -0.714286 // sell
								if( Color_con2 > 2.95708 )
									ret := 0.000000
	if( wvf > 6.18881 )
		if( upperBand <= 14.9495 )
			if( sDev <= 5.62403 )
				if( midLine <= 3.53757 )
					if( upperBand <= 6.25223 )
						if( Color_con2 <= 0.715715 )
							if( upperBand <= 5.94936 )
								ret := -0.800000 // sell
							if( upperBand > 5.94936 )
								ret := -0.250000
						if( Color_con2 > 0.715715 )
							if( Color_con2 <= 2.88262 )
								if( Color_con1 <= 0.603718 )
									ret := 0.958333 // buy
								if( Color_con1 > 0.603718 )
									ret := 0.705882 // buy
							if( Color_con2 > 2.88262 )
								if( sDev <= 2.90495 )
									ret := -0.234043
								if( sDev > 2.90495 )
									ret := 0.421769
					if( upperBand > 6.25223 )
						if( Color_con2 <= 0.18371 )
							if( midLine <= 2.94508 )
								ret := 0.500000
							if( midLine > 2.94508 )
								ret := 1.000000 // buy
						if( Color_con2 > 0.18371 )
							if( lowerBand <= -2.07664 )
								if( Color_con2 <= 5.03786 )
									ret := -0.852459 // sell
								if( Color_con2 > 5.03786 )
									ret := 0.090909
							if( lowerBand > -2.07664 )
								if( wvf <= 7.52033 )
									ret := -0.238095
								if( wvf > 7.52033 )
									ret := 0.345133
				if( midLine > 3.53757 )
					if( Color_con2 <= 2.77637 )
						if( lowerBand <= -0.292197 )
							if( Color_con2 <= 1.78355 )
								if( upperBand <= 8.53754 )
									ret := 0.448276
								if( upperBand > 8.53754 )
									ret := -0.170000
							if( Color_con2 > 1.78355 )
								if( Color_con1 <= -0.532988 )
									ret := -0.520000
								if( Color_con1 > -0.532988 )
									ret := 0.384615
						if( lowerBand > -0.292197 )
							if( midLine <= 9.60295 )
								if( lowerBand <= 4.53302 )
									ret := 0.260722
								if( lowerBand > 4.53302 )
									ret := 0.664000
							if( midLine > 9.60295 )
								if( Color_con2 <= 0.143665 )
									ret := -0.750000 // sell
								if( Color_con2 > 0.143665 )
									ret := 0.523810
					if( Color_con2 > 2.77637 )
						if( midLine <= 6.96036 )
							if( wvf <= 8.21651 )
								if( Color_con2 <= 3.61386 )
									ret := 0.204545
								if( Color_con2 > 3.61386 )
									ret := 0.875000 // buy
							if( wvf > 8.21651 )
								if( sDev <= 3.1238 )
									ret := 0.000000
								if( sDev > 3.1238 )
									ret := 0.729282 // buy
						if( midLine > 6.96036 )
							if( upperBand <= 12.3454 )
								if( Color_con2 <= 3.34747 )
									ret := -1.000000 // sell
								if( Color_con2 > 3.34747 )
									ret := -0.750000 // sell
							if( upperBand > 12.3454 )
								if( Color_con2 <= 3.24351 )
									ret := 1.000000 // buy
								if( Color_con2 > 3.24351 )
									ret := 0.200000
			if( sDev > 5.62403 )
				if( Color_con1 <= -4.58834 )
					if( Color_con2 <= -1.40553 )
						if( Color_con2 <= -17.9724 )
							ret := -1.000000 // sell
						if( Color_con2 > -17.9724 )
							if( lowerBand <= 0.293274 )
								ret := 0.250000
							if( lowerBand > 0.293274 )
								if( Color_con2 <= -5.20043 )
									ret := 0.250000
								if( Color_con2 > -5.20043 )
									ret := 0.931818 // buy
					if( Color_con2 > -1.40553 )
						if( upperBand <= 12.1035 )
							if( colInt <= 0.5 )
								if( sDev <= 6.77826 )
									ret := -0.818182 // sell
								if( sDev > 6.77826 )
									ret := -1.000000 // sell
							if( colInt > 0.5 )
								ret := -0.666667
						if( upperBand > 12.1035 )
							if( upperBand <= 12.6037 )
								if( upperBand <= 12.3421 )
									ret := 0.823529 // buy
								if( upperBand > 12.3421 )
									ret := 0.375000
							if( upperBand > 12.6037 )
								if( wvf <= 9.374 )
									ret := -0.514286
								if( wvf > 9.374 )
									ret := 0.230769
				if( Color_con1 > -4.58834 )
					if( wvf <= 9.06771 )
						if( wvf <= 8.13725 )
							if( wvf <= 6.34081 )
								if( Color_con2 <= 0.178932 )
									ret := -1.000000 // sell
								if( Color_con2 > 0.178932 )
									ret := 0.666667
							if( wvf > 6.34081 )
								if( upperBand <= 10.0003 )
									ret := 0.261905
								if( upperBand > 10.0003 )
									ret := 0.765766 // buy
						if( wvf > 8.13725 )
							if( Color_con1 <= -3.1698 )
								if( wvf <= 8.56443 )
									ret := -0.444444
								if( wvf > 8.56443 )
									ret := -1.000000 // sell
							if( Color_con1 > -3.1698 )
								if( sDev <= 5.93313 )
									ret := -0.111111
								if( sDev > 5.93313 )
									ret := 0.517857
					if( wvf > 9.06771 )
						if( Color_con1 <= -4.32933 )
							ret := -0.333333
						if( Color_con1 > -4.32933 )
							if( Color_con2 <= -4.14884 )
								if( sDev <= 6.68109 )
									ret := -1.000000 // sell
								if( sDev > 6.68109 )
									ret := 0.285714
							if( Color_con2 > -4.14884 )
								if( midLine <= 1.93168 )
									ret := -0.500000
								if( midLine > 1.93168 )
									ret := 0.764706 // buy
		if( upperBand > 14.9495 )
			if( upperBand <= 21.4872 )
				if( sDev <= 7.68568 )
					if( Color_con2 <= 2.48825 )
						if( wvf <= 11.5052 )
							if( wvf <= 10.3666 )
								if( Color_con2 <= -5.64641 )
									ret := -0.200000
								if( Color_con2 > -5.64641 )
									ret := -0.870968 // sell
							if( wvf > 10.3666 )
								if( Color_con1 <= -4.56189 )
									ret := 0.333333
								if( Color_con1 > -4.56189 )
									ret := -0.800000 // sell
						if( wvf > 11.5052 )
							if( colInt <= 0.5 )
								ret := -1.000000 // sell
							if( colInt > 0.5 )
								ret := -0.857143 // sell
					if( Color_con2 > 2.48825 )
						if( lowerBand <= 6.55302 )
							ret := 0.000000
						if( lowerBand > 6.55302 )
							ret := 1.000000 // buy
				if( sDev > 7.68568 )
					if( lowerBand <= -4.85239 )
						if( Color_con2 <= 6.40454 )
							ret := -1.000000 // sell
						if( Color_con2 > 6.40454 )
							ret := 0.000000
					if( lowerBand > -4.85239 )
						if( Color_con2 <= -1.80947 )
							if( wvf <= 9.17162 )
								if( lowerBand <= 2.63623 )
									ret := 0.733333 // buy
								if( lowerBand > 2.63623 )
									ret := -1.000000 // sell
							if( wvf > 9.17162 )
								if( wvf <= 16.2763 )
									ret := -1.000000 // sell
								if( wvf > 16.2763 )
									ret := -0.750000 // sell
						if( Color_con2 > -1.80947 )
							if( sDev <= 11.0855 )
								if( midLine <= 8.60473 )
									ret := 0.439024
								if( midLine > 8.60473 )
									ret := 0.862069 // buy
							if( sDev > 11.0855 )
								if( Color_con2 <= 15.3656 )
									ret := -0.428571
								if( Color_con2 > 15.3656 )
									ret := 1.000000 // buy
			if( upperBand > 21.4872 )
				if( lowerBand <= -0.833193 )
					if( sDev <= 16.1102 )
						if( Color_con2 <= -12.7859 )
							if( midLine <= 11.4523 )
								ret := -1.000000 // sell
							if( midLine > 11.4523 )
								ret := 1.000000 // buy
						if( Color_con2 > -12.7859 )
							if( midLine <= 9.58772 )
								ret := 1.000000 // buy
							if( midLine > 9.58772 )
								if( Color_con2 <= 4.90143 )
									ret := -0.976190 // sell
								if( Color_con2 > 4.90143 )
									ret := -0.653846
					if( sDev > 16.1102 )
						if( Color_con1 <= -20.9175 )
							ret := -1.000000 // sell
						if( Color_con1 > -20.9175 )
							if( wvf <= 13.3199 )
								ret := 1.000000 // buy
							if( wvf > 13.3199 )
								if( Color_con1 <= -10.5678 )
									ret := -0.600000
								if( Color_con1 > -10.5678 )
									ret := 0.818182 // buy
				if( lowerBand > -0.833193 )
					if( upperBand <= 27.0297 )
						if( sDev <= 6.00194 )
							ret := -0.500000
						if( sDev > 6.00194 )
							if( midLine <= 15.4439 )
								if( lowerBand <= -0.551758 )
									ret := 0.000000
								if( lowerBand > -0.551758 )
									ret := 0.925373 // buy
							if( midLine > 15.4439 )
								if( sDev <= 9.26054 )
									ret := 0.830189 // buy
								if( sDev > 9.26054 )
									ret := -1.000000 // sell
					if( upperBand > 27.0297 )
						if( midLine <= 22.8293 )
							if( lowerBand <= -0.132368 )
								if( Color_con2 <= -12.326 )
									ret := 1.000000 // buy
								if( Color_con2 > -12.326 )
									ret := 0.500000
							if( lowerBand > -0.132368 )
								if( wvf <= 17.1227 )
									ret := -0.869565 // sell
								if( wvf > 17.1227 )
									ret := -0.333333
						if( midLine > 22.8293 )
							if( Color_con2 <= 1.85015 )
								if( Color_con2 <= -2.05738 )
									ret := 0.971429 // buy
								if( Color_con2 > -2.05738 )
									ret := 0.600000
							if( Color_con2 > 1.85015 )
								ret := -0.833333 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_SOLUSDT_15Min_2295aa8f(Color_con1, Color_con2, colInt, rangeHigh, midLine, sDev, rangeLow, upperBand, lowerBand, wvf)

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


