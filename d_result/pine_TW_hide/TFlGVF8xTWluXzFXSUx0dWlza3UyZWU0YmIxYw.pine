//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Williams_Vix_Fix
// ID_model: LYFT_1Min_1WIL_2ee4bb1c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LYFT_1Min_1WIL_2ee4bb1c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LYFT_1Min_2ee4bb1c(sDev, Color_con1, lowerBand, wvf, upperBand, midLine, Color_con2, rangeLow, colInt, rangeHigh)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( wvf <= 0.277456 )
		if( Color_con1 <= -0.473639 )
			if( Color_con2 <= -1.05917 )
				if( Color_con2 <= -1.06505 )
					if( lowerBand <= -1.29073 )
						if( upperBand <= 8.89217 )
							ret := -1.000000 // sell
						if( upperBand > 8.89217 )
							ret := -0.461538
					if( lowerBand > -1.29073 )
						if( midLine <= 1.28007 )
							if( lowerBand <= 0.103187 )
								if( midLine <= 0.368105 )
									ret := 0.068558
								if( midLine > 0.368105 )
									ret := -0.077991
							if( lowerBand > 0.103187 )
								if( midLine <= 1.14468 )
									ret := 0.264493
								if( midLine > 1.14468 )
									ret := -0.515152
						if( midLine > 1.28007 )
							if( Color_con1 <= -2.48847 )
								if( midLine <= 1.80464 )
									ret := 0.754967 // buy
								if( midLine > 1.80464 )
									ret := -0.164179
							if( Color_con1 > -2.48847 )
								if( Color_con2 <= -1.50456 )
									ret := -0.740741 // sell
								if( Color_con2 > -1.50456 )
									ret := 0.352941
				if( Color_con2 > -1.06505 )
					if( Color_con2 <= -1.06199 )
						ret := 0.437500
					if( Color_con2 > -1.06199 )
						ret := 0.823529 // buy
			if( Color_con2 > -1.05917 )
				if( sDev <= 1.5892 )
					if( midLine <= 0.326479 )
						if( sDev <= 0.564718 )
							if( upperBand <= 0.509068 )
								if( upperBand <= 0.479937 )
									ret := -0.375000
								if( upperBand > 0.479937 )
									ret := -0.703704 // sell
							if( upperBand > 0.509068 )
								if( upperBand <= 0.546667 )
									ret := 0.117284
								if( upperBand > 0.546667 )
									ret := -0.313595
						if( sDev > 0.564718 )
							if( Color_con1 <= -0.870739 )
								if( sDev <= 0.671006 )
									ret := 0.047619
								if( sDev > 0.671006 )
									ret := -0.875000 // sell
							if( Color_con1 > -0.870739 )
								if( Color_con2 <= -0.66064 )
									ret := -0.687500
								if( Color_con2 > -0.66064 )
									ret := -0.890411 // sell
					if( midLine > 0.326479 )
						if( lowerBand <= -0.437121 )
							if( lowerBand <= -0.514578 )
								if( Color_con2 <= -0.632561 )
									ret := -0.764706 // sell
								if( Color_con2 > -0.632561 )
									ret := -0.333333
							if( lowerBand > -0.514578 )
								if( Color_con1 <= -1.45956 )
									ret := -1.000000 // sell
								if( Color_con1 > -1.45956 )
									ret := -0.904762 // sell
						if( lowerBand > -0.437121 )
							if( upperBand <= 1.37244 )
								if( Color_con1 <= -1.25063 )
									ret := 0.461538
								if( Color_con1 > -1.25063 )
									ret := -0.108753
							if( upperBand > 1.37244 )
								if( midLine <= 0.761115 )
									ret := -0.153153
								if( midLine > 0.761115 )
									ret := -0.410468
				if( sDev > 1.5892 )
					ret := 1.000000 // buy
		if( Color_con1 > -0.473639 )
			if( midLine <= 0.24653 )
				if( midLine <= 0.082904 )
					if( sDev <= 0.083046 )
						if( wvf <= 0.062591 )
							if( midLine <= 0.075664 )
								if( midLine <= 0.02879 )
									ret := 0.725000 // buy
								if( midLine > 0.02879 )
									ret := 0.133333
							if( midLine > 0.075664 )
								if( midLine <= 0.079972 )
									ret := 1.000000 // buy
								if( midLine > 0.079972 )
									ret := 0.909091 // buy
						if( wvf > 0.062591 )
							if( sDev <= 0.074642 )
								if( Color_con2 <= -0.221429 )
									ret := 0.000000
								if( Color_con2 > -0.221429 )
									ret := 0.333333
							if( sDev > 0.074642 )
								ret := -0.312500
					if( sDev > 0.083046 )
						if( lowerBand <= -0.008483 )
							if( Color_con2 <= -0.108828 )
								if( lowerBand <= -0.024623 )
									ret := 0.025594
								if( lowerBand > -0.024623 )
									ret := -0.300000
							if( Color_con2 > -0.108828 )
								if( lowerBand <= -0.034927 )
									ret := 0.265306
								if( lowerBand > -0.034927 )
									ret := 0.709677 // buy
						if( lowerBand > -0.008483 )
							ret := 0.600000
				if( midLine > 0.082904 )
					if( Color_con2 <= -0.349826 )
						if( upperBand <= 0.541781 )
							if( Color_con1 <= -0.311143 )
								if( Color_con2 <= -0.356085 )
									ret := -0.247619
								if( Color_con2 > -0.356085 )
									ret := 0.580645
							if( Color_con1 > -0.311143 )
								if( wvf <= 0.255635 )
									ret := -0.074785
								if( wvf > 0.255635 )
									ret := -0.433333
						if( upperBand > 0.541781 )
							if( lowerBand <= -0.081647 )
								if( lowerBand <= -0.194422 )
									ret := 0.531250
								if( lowerBand > -0.194422 )
									ret := -0.015152
							if( lowerBand > -0.081647 )
								if( wvf <= 0.224266 )
									ret := 0.833333 // buy
								if( wvf > 0.224266 )
									ret := 0.333333
					if( Color_con2 > -0.349826 )
						if( lowerBand <= 0.089759 )
							if( Color_con1 <= -0.290025 )
								if( upperBand <= 0.604874 )
									ret := 0.020625
								if( upperBand > 0.604874 )
									ret := 0.330435
							if( Color_con1 > -0.290025 )
								if( lowerBand <= 0.021088 )
									ret := -0.086674
								if( lowerBand > 0.021088 )
									ret := 0.033461
						if( lowerBand > 0.089759 )
							if( Color_con2 <= -0.03149 )
								if( sDev <= 0.093968 )
									ret := -0.636364
								if( sDev > 0.093968 )
									ret := -0.358621
							if( Color_con2 > -0.03149 )
								ret := 0.600000
			if( midLine > 0.24653 )
				if( midLine <= 0.333941 )
					if( Color_con2 <= -1.27228 )
						if( upperBand <= 0.521834 )
							if( lowerBand <= 0.053288 )
								ret := -0.625000
							if( lowerBand > 0.053288 )
								ret := 0.636364
						if( upperBand > 0.521834 )
							if( sDev <= 0.256815 )
								ret := -0.157895
							if( sDev > 0.256815 )
								if( lowerBand <= -0.018634 )
									ret := -0.545455
								if( lowerBand > -0.018634 )
									ret := -0.872340 // sell
					if( Color_con2 > -1.27228 )
						if( wvf <= 0.094201 )
							if( wvf <= 0.082286 )
								if( wvf <= 0.039597 )
									ret := -0.297297
								if( wvf > 0.039597 )
									ret := 0.076923
							if( wvf > 0.082286 )
								if( Color_con2 <= -0.313092 )
									ret := -0.439024
								if( Color_con2 > -0.313092 )
									ret := 0.040000
						if( wvf > 0.094201 )
							if( Color_con2 <= -0.082446 )
								if( midLine <= 0.317652 )
									ret := 0.090823
								if( midLine > 0.317652 )
									ret := 0.282958
							if( Color_con2 > -0.082446 )
								if( Color_con1 <= -0.222954 )
									ret := -0.574468
								if( Color_con1 > -0.222954 )
									ret := -0.045455
				if( midLine > 0.333941 )
					if( Color_con2 <= -0.190379 )
						if( lowerBand <= 0.123032 )
							if( lowerBand <= 0.044708 )
								if( upperBand <= 0.670003 )
									ret := 0.531250
								if( upperBand > 0.670003 )
									ret := -0.064935
							if( lowerBand > 0.044708 )
								if( midLine <= 0.375992 )
									ret := -0.379433
								if( midLine > 0.375992 )
									ret := 0.000000
						if( lowerBand > 0.123032 )
							if( midLine <= 0.357825 )
								if( sDev <= 0.173159 )
									ret := -0.507937
								if( sDev > 0.173159 )
									ret := 0.130435
							if( midLine > 0.357825 )
								if( midLine <= 0.363935 )
									ret := 0.456522
								if( midLine > 0.363935 )
									ret := 0.032738
					if( Color_con2 > -0.190379 )
						if( Color_con2 <= -0.148754 )
							if( Color_con2 <= -0.175859 )
								if( Color_con1 <= -0.338959 )
									ret := 0.789474 // buy
								if( Color_con1 > -0.338959 )
									ret := 0.416667
							if( Color_con2 > -0.175859 )
								if( midLine <= 0.365438 )
									ret := -0.074074
								if( midLine > 0.365438 )
									ret := 0.708333 // buy
						if( Color_con2 > -0.148754 )
							if( lowerBand <= 0.138783 )
								ret := -0.777778 // sell
							if( lowerBand > 0.138783 )
								ret := 0.083333
	if( wvf > 0.277456 )
		if( Color_con2 <= -0.002862 )
			if( lowerBand <= 1.93434 )
				if( Color_con1 <= -4.77615 )
					if( Color_con1 <= -10.0009 )
						ret := 0.625000
					if( Color_con1 > -10.0009 )
						if( upperBand <= 5.97505 )
							if( Color_con1 <= -5.01335 )
								ret := 0.230769
							if( Color_con1 > -5.01335 )
								ret := -0.428571
						if( upperBand > 5.97505 )
							if( midLine <= 4.73338 )
								if( upperBand <= 7.87578 )
									ret := -0.979167 // sell
								if( upperBand > 7.87578 )
									ret := -0.465116
							if( midLine > 4.73338 )
								ret := -1.000000 // sell
				if( Color_con1 > -4.77615 )
					if( upperBand <= 0.949202 )
						if( wvf <= 0.597401 )
							if( lowerBand <= 0.366254 )
								if( lowerBand <= -0.195292 )
									ret := -0.233108
								if( lowerBand > -0.195292 )
									ret := 0.040324
							if( lowerBand > 0.366254 )
								if( wvf <= 0.525026 )
									ret := 0.452632
								if( wvf > 0.525026 )
									ret := 0.076923
						if( wvf > 0.597401 )
							if( Color_con1 <= -0.118886 )
								if( Color_con1 <= -0.221392 )
									ret := 0.202899
								if( Color_con1 > -0.221392 )
									ret := -0.049603
							if( Color_con1 > -0.118886 )
								if( Color_con2 <= -1.1833 )
									ret := 0.857143 // buy
								if( Color_con2 > -1.1833 )
									ret := 0.173469
					if( upperBand > 0.949202 )
						if( Color_con1 <= -2.82349 )
							if( wvf <= 0.597171 )
								if( Color_con1 <= -3.92442 )
									ret := 0.666667
								if( Color_con1 > -3.92442 )
									ret := -0.107843
							if( wvf > 0.597171 )
								if( Color_con1 <= -3.66929 )
									ret := 0.307692
								if( Color_con1 > -3.66929 )
									ret := 0.679612
						if( Color_con1 > -2.82349 )
							if( midLine <= 1.49238 )
								if( lowerBand <= 0.810442 )
									ret := -0.040305
								if( lowerBand > 0.810442 )
									ret := -0.280922
							if( midLine > 1.49238 )
								if( wvf <= 6.35 )
									ret := 0.085714
								if( wvf > 6.35 )
									ret := 1.000000 // buy
			if( lowerBand > 1.93434 )
				if( upperBand <= 3.54049 )
					ret := -0.333333
				if( upperBand > 3.54049 )
					if( Color_con1 <= -2.62191 )
						if( lowerBand <= 4.26679 )
							if( Color_con1 <= -4.15178 )
								if( lowerBand <= 2.67342 )
									ret := -0.500000
								if( lowerBand > 2.67342 )
									ret := -0.300000
							if( Color_con1 > -4.15178 )
								if( sDev <= 1.69414 )
									ret := -0.125000
								if( sDev > 1.69414 )
									ret := 0.923077 // buy
						if( lowerBand > 4.26679 )
							ret := 0.875000 // buy
					if( Color_con1 > -2.62191 )
						if( Color_con2 <= -0.838043 )
							if( sDev <= 1.0982 )
								ret := 0.933333 // buy
							if( sDev > 1.0982 )
								ret := 1.000000 // buy
						if( Color_con2 > -0.838043 )
							if( Color_con1 <= -1.15419 )
								if( wvf <= 3.52681 )
									ret := 0.666667
								if( wvf > 3.52681 )
									ret := 1.000000 // buy
							if( Color_con1 > -1.15419 )
								if( sDev <= 0.784699 )
									ret := 0.882353 // buy
								if( sDev > 0.784699 )
									ret := 0.500000
		if( Color_con2 > -0.002862 )
			if( Color_con2 <= 1.42871 )
				if( wvf <= 3.78793 )
					if( midLine <= 0.737539 )
						if( upperBand <= 1.15158 )
							if( Color_con2 <= 0.980654 )
								if( upperBand <= 0.568581 )
									ret := 0.177133
								if( upperBand > 0.568581 )
									ret := 0.079371
							if( Color_con2 > 0.980654 )
								if( Color_con2 <= 1.23737 )
									ret := 0.954545 // buy
								if( Color_con2 > 1.23737 )
									ret := -0.363636
						if( upperBand > 1.15158 )
							if( upperBand <= 1.5994 )
								if( upperBand <= 1.16025 )
									ret := 0.680851
								if( upperBand > 1.16025 )
									ret := 0.279229
							if( upperBand > 1.5994 )
								if( Color_con2 <= 1.17939 )
									ret := -0.120763
								if( Color_con2 > 1.17939 )
									ret := 0.742857 // buy
					if( midLine > 0.737539 )
						if( Color_con1 <= -0.071693 )
							if( midLine <= 1.54396 )
								if( Color_con1 <= -0.738137 )
									ret := 0.395833
								if( Color_con1 > -0.738137 )
									ret := 0.002217
							if( midLine > 1.54396 )
								if( Color_con2 <= 0.247361 )
									ret := -0.129630
								if( Color_con2 > 0.247361 )
									ret := 0.684615
						if( Color_con1 > -0.071693 )
							if( Color_con2 <= 0.877294 )
								if( upperBand <= 1.65489 )
									ret := -0.029240
								if( upperBand > 1.65489 )
									ret := -0.598765
							if( Color_con2 > 0.877294 )
								if( sDev <= 0.783079 )
									ret := -1.000000 // sell
								if( sDev > 0.783079 )
									ret := 0.211679
				if( wvf > 3.78793 )
					if( sDev <= 2.51668 )
						if( wvf <= 4.31758 )
							if( Color_con2 <= 0.233128 )
								ret := -0.800000 // sell
							if( Color_con2 > 0.233128 )
								ret := 0.166667
						if( wvf > 4.31758 )
							if( Color_con1 <= -0.757313 )
								ret := 0.666667
							if( Color_con1 > -0.757313 )
								ret := 0.500000
					if( sDev > 2.51668 )
						if( sDev <= 2.89037 )
							if( Color_con2 <= 1.13317 )
								ret := -1.000000 // sell
							if( Color_con2 > 1.13317 )
								ret := -0.900000 // sell
						if( sDev > 2.89037 )
							if( wvf <= 4.88518 )
								ret := 0.375000
							if( wvf > 4.88518 )
								if( Color_con1 <= -4.02262 )
									ret := -1.000000 // sell
								if( Color_con1 > -4.02262 )
									ret := 0.777778 // buy
			if( Color_con2 > 1.42871 )
				if( sDev <= 3.075 )
					if( sDev <= 1.28561 )
						if( midLine <= 0.400404 )
							ret := -0.750000 // sell
						if( midLine > 0.400404 )
							if( midLine <= 0.584343 )
								if( upperBand <= 1.65417 )
									ret := 0.619048
								if( upperBand > 1.65417 )
									ret := 1.000000 // buy
							if( midLine > 0.584343 )
								if( Color_con1 <= 0.411754 )
									ret := -0.142857
								if( Color_con1 > 0.411754 )
									ret := -0.500000
					if( sDev > 1.28561 )
						if( Color_con2 <= 2.12853 )
							if( wvf <= 2.91406 )
								if( upperBand <= 2.15017 )
									ret := -0.470588
								if( upperBand > 2.15017 )
									ret := -0.943182 // sell
							if( wvf > 2.91406 )
								if( lowerBand <= -0.643565 )
									ret := -0.227273
								if( lowerBand > -0.643565 )
									ret := -0.860000 // sell
						if( Color_con2 > 2.12853 )
							if( Color_con1 <= 0.628253 )
								if( upperBand <= 3.72042 )
									ret := 0.083333
								if( upperBand > 3.72042 )
									ret := -0.956522 // sell
							if( Color_con1 > 0.628253 )
								ret := 0.866667 // buy
				if( sDev > 3.075 )
					if( upperBand <= 10.7196 )
						if( upperBand <= 7.02526 )
							if( midLine <= 1.68736 )
								ret := 0.461538
							if( midLine > 1.68736 )
								if( sDev <= 3.53909 )
									ret := 0.888889 // buy
								if( sDev > 3.53909 )
									ret := 1.000000 // buy
						if( upperBand > 7.02526 )
							ret := 0.200000
					if( upperBand > 10.7196 )
						if( Color_con1 <= -3.81815 )
							ret := -1.000000 // sell
						if( Color_con1 > -3.81815 )
							ret := 0.222222
	
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
float op_operation = decision_tree_0_LYFT_1Min_2ee4bb1c(sDev, Color_con1, lowerBand, wvf, upperBand, midLine, Color_con2, rangeLow, colInt, rangeHigh)

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


