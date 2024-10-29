//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Williams_Vix_Fix
// ID_model: ATOMUSDT_15Min_1WIL_9e737fd5 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ATOMUSDT_15Min_1WIL_9e737fd5", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ATOMUSDT_15Min_9e737fd5(rangeHigh, rangeLow, midLine, sDev, lowerBand, wvf, Color_con1, colInt, Color_con2, upperBand)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( wvf <= 2.6809 )
		if( midLine <= 1.66955 )
			if( midLine <= 0.959819 )
				if( Color_con2 <= -4.56671 )
					if( sDev <= 1.02567 )
						if( Color_con1 <= -1.00064 )
							if( sDev <= 0.938931 )
								if( upperBand <= 1.68096 )
									ret := 0.895522 // buy
								if( upperBand > 1.68096 )
									ret := 0.272727
							if( sDev > 0.938931 )
								if( lowerBand <= -0.065756 )
									ret := -0.545455
								if( lowerBand > -0.065756 )
									ret := 1.000000 // buy
						if( Color_con1 > -1.00064 )
							if( lowerBand <= 0.221026 )
								if( sDev <= 0.9097 )
									ret := -0.011628
								if( sDev > 0.9097 )
									ret := 0.717949 // buy
							if( lowerBand > 0.221026 )
								if( midLine <= 0.823407 )
									ret := 0.753247 // buy
								if( midLine > 0.823407 )
									ret := -0.166667
					if( sDev > 1.02567 )
						if( midLine <= 0.885236 )
							if( lowerBand <= -0.431465 )
								ret := 0.000000
							if( lowerBand > -0.431465 )
								if( wvf <= 0.630866 )
									ret := -0.933333 // sell
								if( wvf > 0.630866 )
									ret := 0.000000
						if( midLine > 0.885236 )
							if( Color_con2 <= -4.84167 )
								if( wvf <= 0.567544 )
									ret := 0.000000
								if( wvf > 0.567544 )
									ret := -0.181818
							if( Color_con2 > -4.84167 )
								ret := 0.750000 // buy
				if( Color_con2 > -4.56671 )
					if( lowerBand <= -0.059133 )
						if( Color_con1 <= 0.076043 )
							if( lowerBand <= -0.267685 )
								if( Color_con2 <= 1.074 )
									ret := 0.000000
								if( Color_con2 > 1.074 )
									ret := -0.549020
							if( lowerBand > -0.267685 )
								if( Color_con2 <= -1.12397 )
									ret := 0.136463
								if( Color_con2 > -1.12397 )
									ret := 0.059099
						if( Color_con1 > 0.076043 )
							if( midLine <= 0.752323 )
								if( midLine <= 0.583619 )
									ret := 0.182524
								if( midLine > 0.583619 )
									ret := -0.002740
							if( midLine > 0.752323 )
								if( sDev <= 1.47185 )
									ret := 0.355932
								if( sDev > 1.47185 )
									ret := -0.583333
					if( lowerBand > -0.059133 )
						if( Color_con2 <= -0.110569 )
							if( upperBand <= 1.10374 )
								if( Color_con2 <= -0.396114 )
									ret := 0.073217
								if( Color_con2 > -0.396114 )
									ret := -0.016949
							if( upperBand > 1.10374 )
								if( sDev <= 0.760535 )
									ret := -0.023390
								if( sDev > 0.760535 )
									ret := 0.079782
						if( Color_con2 > -0.110569 )
							if( wvf <= 1.98155 )
								if( wvf <= 1.40858 )
									ret := -0.022516
								if( wvf > 1.40858 )
									ret := -0.195015
							if( wvf > 1.98155 )
								if( wvf <= 2.18525 )
									ret := 0.541176
								if( wvf > 2.18525 )
									ret := -0.285714
			if( midLine > 0.959819 )
				if( Color_con2 <= -4.09987 )
					if( upperBand <= 2.35543 )
						if( wvf <= 1.04842 )
							if( sDev <= 0.861718 )
								if( Color_con2 <= -4.49551 )
									ret := -0.034483
								if( Color_con2 > -4.49551 )
									ret := -0.880000 // sell
							if( sDev > 0.861718 )
								if( Color_con2 <= -4.67367 )
									ret := 0.707317 // buy
								if( Color_con2 > -4.67367 )
									ret := 0.019608
						if( wvf > 1.04842 )
							if( lowerBand <= 0.711067 )
								if( Color_con1 <= -0.273068 )
									ret := 0.743902 // buy
								if( Color_con1 > -0.273068 )
									ret := 0.133333
							if( lowerBand > 0.711067 )
								if( wvf <= 1.48119 )
									ret := 0.200000
								if( wvf > 1.48119 )
									ret := -0.714286 // sell
					if( upperBand > 2.35543 )
						if( midLine <= 1.23159 )
							if( Color_con2 <= -5.80151 )
								if( midLine <= 1.11943 )
									ret := 0.781250 // buy
								if( midLine > 1.11943 )
									ret := 0.066667
							if( Color_con2 > -5.80151 )
								if( Color_con2 <= -4.17115 )
									ret := -0.090909
								if( Color_con2 > -4.17115 )
									ret := 0.705882 // buy
						if( midLine > 1.23159 )
							if( Color_con2 <= -6.47854 )
								if( Color_con2 <= -9.59386 )
									ret := 0.260870
								if( Color_con2 > -9.59386 )
									ret := -0.596774
							if( Color_con2 > -6.47854 )
								if( midLine <= 1.41151 )
									ret := -0.184397
								if( midLine > 1.41151 )
									ret := 0.184080
				if( Color_con2 > -4.09987 )
					if( Color_con2 <= 0.298318 )
						if( lowerBand <= 0.186127 )
							if( Color_con2 <= -1.37615 )
								if( wvf <= 1.33481 )
									ret := -0.030094
								if( wvf > 1.33481 )
									ret := 0.147715
							if( Color_con2 > -1.37615 )
								if( upperBand <= 3.17428 )
									ret := -0.077178
								if( upperBand > 3.17428 )
									ret := -0.248000
						if( lowerBand > 0.186127 )
							if( midLine <= 0.973139 )
								if( Color_con2 <= -1.35969 )
									ret := 0.000000
								if( Color_con2 > -1.35969 )
									ret := -0.342105
							if( midLine > 0.973139 )
								if( upperBand <= 2.84395 )
									ret := 0.018706
								if( upperBand > 2.84395 )
									ret := -0.153266
					if( Color_con2 > 0.298318 )
						if( lowerBand <= 0.733588 )
							if( Color_con2 <= 1.21511 )
								if( upperBand <= 3.22226 )
									ret := 0.080791
								if( upperBand > 3.22226 )
									ret := 0.362069
							if( Color_con2 > 1.21511 )
								if( Color_con2 <= 1.40732 )
									ret := -0.405063
								if( Color_con2 > 1.40732 )
									ret := 0.138889
						if( lowerBand > 0.733588 )
							if( lowerBand <= 0.829547 )
								if( Color_con2 <= 0.362554 )
									ret := 0.125000
								if( Color_con2 > 0.362554 )
									ret := -0.803571 // sell
							if( lowerBand > 0.829547 )
								if( Color_con1 <= -0.050966 )
									ret := -0.222222
								if( Color_con1 > -0.050966 )
									ret := 0.466667
		if( midLine > 1.66955 )
			if( Color_con2 <= 0.101884 )
				if( midLine <= 7.08454 )
					if( upperBand <= 9.22595 )
						if( upperBand <= 3.30035 )
							if( Color_con1 <= -1.50566 )
								if( Color_con2 <= -0.711611 )
									ret := 0.155030
								if( Color_con2 > -0.711611 )
									ret := 0.489051
							if( Color_con1 > -1.50566 )
								if( midLine <= 2.40852 )
									ret := 0.036600
								if( midLine > 2.40852 )
									ret := 0.486111
						if( upperBand > 3.30035 )
							if( Color_con2 <= -12.04 )
								if( Color_con2 <= -13.319 )
									ret := -0.250000
								if( Color_con2 > -13.319 )
									ret := 0.871795 // buy
							if( Color_con2 > -12.04 )
								if( Color_con2 <= -4.86402 )
									ret := -0.098531
								if( Color_con2 > -4.86402 )
									ret := 0.045772
					if( upperBand > 9.22595 )
						if( sDev <= 5.57903 )
							if( Color_con2 <= -4.03783 )
								if( Color_con2 <= -4.58762 )
									ret := 0.438053
								if( Color_con2 > -4.58762 )
									ret := 0.916667 // buy
							if( Color_con2 > -4.03783 )
								ret := -0.428571
						if( sDev > 5.57903 )
							if( Color_con2 <= -8.83123 )
								if( wvf <= 0.835838 )
									ret := 0.166667
								if( wvf > 0.835838 )
									ret := 0.844828 // buy
							if( Color_con2 > -8.83123 )
								if( Color_con2 <= -5.50465 )
									ret := -0.184874
								if( Color_con2 > -5.50465 )
									ret := 0.650000
				if( midLine > 7.08454 )
					if( midLine <= 8.0439 )
						if( midLine <= 7.529 )
							if( upperBand <= 12.6351 )
								ret := -1.000000 // sell
							if( upperBand > 12.6351 )
								if( upperBand <= 13.9724 )
									ret := 0.333333
								if( upperBand > 13.9724 )
									ret := -0.692308
						if( midLine > 7.529 )
							if( Color_con1 <= -12.3026 )
								if( upperBand <= 16.3202 )
									ret := -0.500000
								if( upperBand > 16.3202 )
									ret := -1.000000 // sell
							if( Color_con1 > -12.3026 )
								ret := -1.000000 // sell
					if( midLine > 8.0439 )
						if( wvf <= 1.84663 )
							if( upperBand <= 19.3088 )
								if( midLine <= 9.76126 )
									ret := -0.800000 // sell
								if( midLine > 9.76126 )
									ret := -0.428571
							if( upperBand > 19.3088 )
								ret := 0.600000
						if( wvf > 1.84663 )
							if( midLine <= 9.83037 )
								if( Color_con2 <= -10.2924 )
									ret := 0.250000
								if( Color_con2 > -10.2924 )
									ret := 0.944444 // buy
							if( midLine > 9.83037 )
								ret := -1.000000 // sell
			if( Color_con2 > 0.101884 )
				if( midLine <= 1.77196 )
					if( Color_con2 <= 0.835393 )
						if( upperBand <= 2.61931 )
							if( midLine <= 1.68665 )
								if( sDev <= 0.861408 )
									ret := 1.000000 // buy
								if( sDev > 0.861408 )
									ret := 0.000000
							if( midLine > 1.68665 )
								if( Color_con1 <= -0.144231 )
									ret := -0.727273 // sell
								if( Color_con1 > -0.144231 )
									ret := 0.333333
						if( upperBand > 2.61931 )
							if( upperBand <= 3.6866 )
								if( midLine <= 1.68037 )
									ret := 0.086957
								if( midLine > 1.68037 )
									ret := 0.662252
							if( upperBand > 3.6866 )
								ret := -0.750000 // sell
					if( Color_con2 > 0.835393 )
						ret := -1.000000 // sell
				if( midLine > 1.77196 )
					if( lowerBand <= 0.51529 )
						if( lowerBand <= -0.078423 )
							if( lowerBand <= -0.223542 )
								ret := 0.166667
							if( lowerBand > -0.223542 )
								if( Color_con2 <= 0.268764 )
									ret := 1.000000 // buy
								if( Color_con2 > 0.268764 )
									ret := 0.750000 // buy
						if( lowerBand > -0.078423 )
							if( upperBand <= 3.50644 )
								if( Color_con1 <= -0.744253 )
									ret := 0.197368
								if( Color_con1 > -0.744253 )
									ret := -0.526316
							if( upperBand > 3.50644 )
								if( upperBand <= 3.7047 )
									ret := -0.577778
								if( upperBand > 3.7047 )
									ret := 0.083333
					if( lowerBand > 0.51529 )
						if( Color_con1 <= -0.67839 )
							if( sDev <= 1.05526 )
								ret := 0.000000
							if( sDev > 1.05526 )
								if( wvf <= 2.23711 )
									ret := 0.000000
								if( wvf > 2.23711 )
									ret := 0.777778 // buy
						if( Color_con1 > -0.67839 )
							if( lowerBand <= 1.24496 )
								if( Color_con1 <= -0.221571 )
									ret := 0.105634
								if( Color_con1 > -0.221571 )
									ret := -0.437500
							if( lowerBand > 1.24496 )
								if( lowerBand <= 1.55025 )
									ret := 0.545455
								if( lowerBand > 1.55025 )
									ret := -0.300000
	if( wvf > 2.6809 )
		if( Color_con1 <= -8.17521 )
			if( Color_con2 <= -11.5205 )
				ret := -1.000000 // sell
			if( Color_con2 > -11.5205 )
				if( lowerBand <= -1.5532 )
					if( Color_con1 <= -8.79837 )
						ret := -1.000000 // sell
					if( Color_con1 > -8.79837 )
						ret := -0.250000
				if( lowerBand > -1.5532 )
					if( lowerBand <= 5.14579 )
						if( Color_con1 <= -14.8628 )
							if( lowerBand <= 1.00518 )
								if( Color_con1 <= -18.297 )
									ret := -0.500000
								if( Color_con1 > -18.297 )
									ret := 0.916667 // buy
							if( lowerBand > 1.00518 )
								if( midLine <= 11.8382 )
									ret := 0.500000
								if( midLine > 11.8382 )
									ret := -0.888889 // sell
						if( Color_con1 > -14.8628 )
							if( midLine <= 8.87395 )
								if( upperBand <= 13.305 )
									ret := -0.222222
								if( upperBand > 13.305 )
									ret := 0.384615
							if( midLine > 8.87395 )
								if( Color_con1 <= -9.69921 )
									ret := -0.662338
								if( Color_con1 > -9.69921 )
									ret := -0.222222
					if( lowerBand > 5.14579 )
						if( Color_con1 <= -8.46113 )
							if( Color_con2 <= -9.03389 )
								ret := -0.500000
							if( Color_con2 > -9.03389 )
								if( wvf <= 8.67186 )
									ret := 0.905660 // buy
								if( wvf > 8.67186 )
									ret := 0.000000
						if( Color_con1 > -8.46113 )
							ret := -1.000000 // sell
		if( Color_con1 > -8.17521 )
			if( Color_con2 <= -6.92626 )
				if( sDev <= 6.33101 )
					if( lowerBand <= 4.29499 )
						if( wvf <= 3.00327 )
							if( midLine <= 2.4701 )
								if( Color_con1 <= -0.303883 )
									ret := 1.000000 // buy
								if( Color_con1 > -0.303883 )
									ret := 0.500000
							if( midLine > 2.4701 )
								if( wvf <= 2.78185 )
									ret := -1.000000 // sell
								if( wvf > 2.78185 )
									ret := 0.166667
						if( wvf > 3.00327 )
							if( upperBand <= 8.98487 )
								if( sDev <= 3.5948 )
									ret := 0.888889 // buy
								if( sDev > 3.5948 )
									ret := -0.150000
							if( upperBand > 8.98487 )
								if( Color_con2 <= -15.405 )
									ret := 0.500000
								if( Color_con2 > -15.405 )
									ret := 0.962963 // buy
					if( lowerBand > 4.29499 )
						ret := -1.000000 // sell
				if( sDev > 6.33101 )
					if( Color_con1 <= -6.87131 )
						if( wvf <= 5.32359 )
							ret := 0.000000
						if( wvf > 5.32359 )
							ret := -1.000000 // sell
					if( Color_con1 > -6.87131 )
						ret := 0.400000
			if( Color_con2 > -6.92626 )
				if( upperBand <= 12.579 )
					if( upperBand <= 10.9291 )
						if( midLine <= 7.00734 )
							if( lowerBand <= -2.78726 )
								if( Color_con2 <= 4.36667 )
									ret := 0.458333
								if( Color_con2 > 4.36667 )
									ret := 0.840909 // buy
							if( lowerBand > -2.78726 )
								if( sDev <= 2.76878 )
									ret := 0.159763
								if( sDev > 2.76878 )
									ret := 0.083352
						if( midLine > 7.00734 )
							if( Color_con1 <= -5.56933 )
								if( Color_con2 <= -3.89764 )
									ret := 0.000000
								if( Color_con2 > -3.89764 )
									ret := -1.000000 // sell
							if( Color_con1 > -5.56933 )
								if( sDev <= 1.97194 )
									ret := -0.500000
								if( sDev > 1.97194 )
									ret := 0.760000 // buy
					if( upperBand > 10.9291 )
						if( Color_con2 <= 0.297429 )
							if( upperBand <= 12.4125 )
								if( wvf <= 3.45291 )
									ret := 0.750000 // buy
								if( wvf > 3.45291 )
									ret := -0.610294
							if( upperBand > 12.4125 )
								if( Color_con2 <= -1.96608 )
									ret := 0.000000
								if( Color_con2 > -1.96608 )
									ret := 1.000000 // buy
						if( Color_con2 > 0.297429 )
							if( Color_con2 <= 2.73659 )
								if( midLine <= 7.13558 )
									ret := 0.777778 // buy
								if( midLine > 7.13558 )
									ret := -0.090909
							if( Color_con2 > 2.73659 )
								if( upperBand <= 11.8201 )
									ret := -0.603774
								if( upperBand > 11.8201 )
									ret := 0.206897
				if( upperBand > 12.579 )
					if( lowerBand <= -3.93298 )
						if( Color_con2 <= 9.28054 )
							if( sDev <= 9.12447 )
								ret := 0.600000
							if( sDev > 9.12447 )
								if( Color_con2 <= 2.02706 )
									ret := 0.000000
								if( Color_con2 > 2.02706 )
									ret := -0.896552 // sell
						if( Color_con2 > 9.28054 )
							if( upperBand <= 17.2027 )
								ret := 1.000000 // buy
							if( upperBand > 17.2027 )
								ret := 0.600000
					if( lowerBand > -3.93298 )
						if( lowerBand <= 1.65158 )
							if( lowerBand <= -2.14415 )
								if( Color_con2 <= 6.09599 )
									ret := 0.016393
								if( Color_con2 > 6.09599 )
									ret := 0.923077 // buy
							if( lowerBand > -2.14415 )
								if( midLine <= 7.73862 )
									ret := 0.902778 // buy
								if( midLine > 7.73862 )
									ret := 0.648936
						if( lowerBand > 1.65158 )
							if( wvf <= 10.0517 )
								if( lowerBand <= 5.77369 )
									ret := 0.264368
								if( lowerBand > 5.77369 )
									ret := 0.888889 // buy
							if( wvf > 10.0517 )
								if( Color_con2 <= 1.36927 )
									ret := -0.186047
								if( Color_con2 > 1.36927 )
									ret := 0.764706 // buy
	
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
float op_operation = decision_tree_0_ATOMUSDT_15Min_9e737fd5(rangeHigh, rangeLow, midLine, sDev, lowerBand, wvf, Color_con1, colInt, Color_con2, upperBand)

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


