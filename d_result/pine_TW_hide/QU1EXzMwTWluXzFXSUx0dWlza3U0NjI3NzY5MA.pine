//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Williams_Vix_Fix
// ID_model: AMD_30Min_1WIL_46277690 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMD_30Min_1WIL_46277690", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMD_30Min_46277690(rangeHigh, rangeLow, midLine, sDev, lowerBand, wvf, Color_con1, colInt, Color_con2, upperBand)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( wvf <= 1.5797 )
		if( lowerBand <= 0.542091 )
			if( upperBand <= 1.20816 )
				if( Color_con2 <= -1.15312 )
					if( lowerBand <= -0.152684 )
						if( Color_con1 <= -0.862649 )
							if( lowerBand <= -0.386464 )
								if( wvf <= 0.184196 )
									ret := -0.250000
								if( wvf > 0.184196 )
									ret := -0.800000 // sell
							if( lowerBand > -0.386464 )
								if( lowerBand <= -0.373424 )
									ret := 1.000000 // buy
								if( lowerBand > -0.373424 )
									ret := 0.050633
						if( Color_con1 > -0.862649 )
							if( upperBand <= 0.862012 )
								if( colInt <= 0.5 )
									ret := -0.178947
								if( colInt > 0.5 )
									ret := 0.588235
							if( upperBand > 0.862012 )
								if( sDev <= 0.702419 )
									ret := -0.588040
								if( sDev > 0.702419 )
									ret := -0.300000
					if( lowerBand > -0.152684 )
						if( wvf <= 0.354149 )
							if( Color_con1 <= -0.225401 )
								if( upperBand <= 0.488087 )
									ret := 0.750000 // buy
								if( upperBand > 0.488087 )
									ret := 0.112754
							if( Color_con1 > -0.225401 )
								if( sDev <= 0.235414 )
									ret := -0.888889 // sell
								if( sDev > 0.235414 )
									ret := -0.250000
						if( wvf > 0.354149 )
							if( wvf <= 1.05412 )
								if( Color_con2 <= -1.18997 )
									ret := -0.126566
								if( Color_con2 > -1.18997 )
									ret := -0.645161
							if( wvf > 1.05412 )
								if( Color_con2 <= -2.32459 )
									ret := 0.736842 // buy
								if( Color_con2 > -2.32459 )
									ret := -0.083333
				if( Color_con2 > -1.15312 )
					if( upperBand <= 1.11427 )
						if( lowerBand <= -0.344335 )
							if( lowerBand <= -0.408728 )
								if( Color_con1 <= 0.056096 )
									ret := 0.333333
								if( Color_con1 > 0.056096 )
									ret := 0.000000
							if( lowerBand > -0.408728 )
								if( wvf <= 0.466303 )
									ret := 0.285714
								if( wvf > 0.466303 )
									ret := 0.923077 // buy
						if( lowerBand > -0.344335 )
							if( sDev <= 0.592061 )
								if( sDev <= 0.500957 )
									ret := 0.054325
								if( sDev > 0.500957 )
									ret := 0.261863
							if( sDev > 0.592061 )
								if( Color_con2 <= -0.315684 )
									ret := -0.224576
								if( Color_con2 > -0.315684 )
									ret := 0.187500
					if( upperBand > 1.11427 )
						if( Color_con2 <= -0.559135 )
							if( colInt <= 0.5 )
								if( sDev <= 0.701619 )
									ret := 0.011583
								if( sDev > 0.701619 )
									ret := 0.437500
							if( colInt > 0.5 )
								if( sDev <= 0.721137 )
									ret := -0.666667
								if( sDev > 0.721137 )
									ret := 0.000000
						if( Color_con2 > -0.559135 )
							if( Color_con2 <= 0.109649 )
								if( midLine <= 0.764529 )
									ret := -0.344173
								if( midLine > 0.764529 )
									ret := 0.500000
							if( Color_con2 > 0.109649 )
								if( upperBand <= 1.11983 )
									ret := -0.333333
								if( upperBand > 1.11983 )
									ret := 0.421053
			if( upperBand > 1.20816 )
				if( lowerBand <= -2.50289 )
					if( Color_con2 <= -11.3384 )
						if( midLine <= 7.04958 )
							ret := -1.000000 // sell
						if( midLine > 7.04958 )
							ret := -0.500000
					if( Color_con2 > -11.3384 )
						if( Color_con2 <= -5.19193 )
							if( upperBand <= 13.1473 )
								if( Color_con2 <= -7.34845 )
									ret := 0.652174
								if( Color_con2 > -7.34845 )
									ret := 1.000000 // buy
							if( upperBand > 13.1473 )
								ret := -0.166667
						if( Color_con2 > -5.19193 )
							if( Color_con1 <= -5.08402 )
								if( upperBand <= 8.1253 )
									ret := -0.200000
								if( upperBand > 8.1253 )
									ret := -1.000000 // sell
							if( Color_con1 > -5.08402 )
								if( lowerBand <= -2.74347 )
									ret := 0.333333
								if( lowerBand > -2.74347 )
									ret := 1.000000 // buy
				if( lowerBand > -2.50289 )
					if( Color_con2 <= -8.17202 )
						if( lowerBand <= -2.08502 )
							if( Color_con1 <= -13.1367 )
								ret := -0.250000
							if( Color_con1 > -13.1367 )
								if( wvf <= 0.466308 )
									ret := 0.000000
								if( wvf > 0.466308 )
									ret := 0.882353 // buy
						if( lowerBand > -2.08502 )
							if( upperBand <= 1.70498 )
								if( wvf <= 0.323722 )
									ret := 0.000000
								if( wvf > 0.323722 )
									ret := 0.857143 // buy
							if( upperBand > 1.70498 )
								if( upperBand <= 17.1497 )
									ret := -0.500000
								if( upperBand > 17.1497 )
									ret := 1.000000 // buy
					if( Color_con2 > -8.17202 )
						if( sDev <= 6.76301 )
							if( Color_con1 <= -7.49581 )
								if( lowerBand <= -1.63792 )
									ret := -0.577320
								if( lowerBand > -1.63792 )
									ret := -0.073846
							if( Color_con1 > -7.49581 )
								if( Color_con2 <= -6.89644 )
									ret := 0.326154
								if( Color_con2 > -6.89644 )
									ret := 0.058155
						if( sDev > 6.76301 )
							if( sDev <= 7.14245 )
								ret := 1.000000 // buy
							if( sDev > 7.14245 )
								ret := 0.714286 // buy
		if( lowerBand > 0.542091 )
			if( Color_con1 <= -4.54244 )
				if( Color_con1 <= -4.82029 )
					if( Color_con2 <= -5.95146 )
						if( Color_con2 <= -10.5269 )
							ret := 0.571429
						if( Color_con2 > -10.5269 )
							if( midLine <= 7.23986 )
								if( wvf <= 0.97926 )
									ret := -0.457627
								if( wvf > 0.97926 )
									ret := -0.807692 // sell
							if( midLine > 7.23986 )
								if( Color_con1 <= -11.5535 )
									ret := -0.470588
								if( Color_con1 > -11.5535 )
									ret := 0.777778 // buy
					if( Color_con2 > -5.95146 )
						if( sDev <= 3.43326 )
							if( Color_con2 <= -5.11402 )
								if( upperBand <= 8.6725 )
									ret := 0.256410
								if( upperBand > 8.6725 )
									ret := -1.000000 // sell
							if( Color_con2 > -5.11402 )
								if( lowerBand <= 0.684585 )
									ret := 0.021739
								if( lowerBand > 0.684585 )
									ret := -0.333333
						if( sDev > 3.43326 )
							if( Color_con2 <= -5.60937 )
								if( upperBand <= 10.1928 )
									ret := -0.250000
								if( upperBand > 10.1928 )
									ret := -0.833333 // sell
							if( Color_con2 > -5.60937 )
								if( Color_con2 <= -4.18429 )
									ret := 0.481481
								if( Color_con2 > -4.18429 )
									ret := -0.428571
				if( Color_con1 > -4.82029 )
					if( Color_con2 <= -3.13429 )
						if( sDev <= 1.86485 )
							ret := 0.000000
						if( sDev > 1.86485 )
							if( Color_con2 <= -3.83877 )
								if( Color_con1 <= -4.6312 )
									ret := 0.000000
								if( Color_con1 > -4.6312 )
									ret := -0.500000
							if( Color_con2 > -3.83877 )
								if( midLine <= 3.95347 )
									ret := -0.913043 // sell
								if( midLine > 3.95347 )
									ret := -0.500000
					if( Color_con2 > -3.13429 )
						if( Color_con2 <= -2.77246 )
							if( Color_con1 <= -4.61449 )
								if( upperBand <= 5.61314 )
									ret := -0.150000
								if( upperBand > 5.61314 )
									ret := -0.631579
							if( Color_con1 > -4.61449 )
								if( sDev <= 2.21746 )
									ret := 1.000000 // buy
								if( sDev > 2.21746 )
									ret := 0.000000
						if( Color_con2 > -2.77246 )
							if( sDev <= 2.40182 )
								ret := -1.000000 // sell
							if( sDev > 2.40182 )
								ret := -0.750000 // sell
			if( Color_con1 > -4.54244 )
				if( Color_con2 <= -4.93435 )
					if( upperBand <= 2.05741 )
						ret := -0.666667
					if( upperBand > 2.05741 )
						if( sDev <= 1.62272 )
							if( Color_con2 <= -6.27814 )
								if( wvf <= 0.601247 )
									ret := -0.250000
								if( wvf > 0.601247 )
									ret := 0.090909
							if( Color_con2 > -6.27814 )
								if( lowerBand <= 0.563057 )
									ret := 0.000000
								if( lowerBand > 0.563057 )
									ret := 0.717647 // buy
						if( sDev > 1.62272 )
							if( lowerBand <= 0.867678 )
								if( wvf <= 1.06698 )
									ret := -0.111111
								if( wvf > 1.06698 )
									ret := 0.625000
							if( lowerBand > 0.867678 )
								if( wvf <= 1.47025 )
									ret := 0.000000
								if( wvf > 1.47025 )
									ret := -1.000000 // sell
				if( Color_con2 > -4.93435 )
					if( wvf <= 1.37507 )
						if( midLine <= 1.36309 )
							if( upperBand <= 1.5221 )
								if( upperBand <= 1.21141 )
									ret := -0.583333
								if( upperBand > 1.21141 )
									ret := 0.313433
							if( upperBand > 1.5221 )
								if( sDev <= 0.570934 )
									ret := -0.418605
								if( sDev > 0.570934 )
									ret := 0.000000
						if( midLine > 1.36309 )
							if( sDev <= 0.750094 )
								if( Color_con1 <= -1.41751 )
									ret := -0.300000
								if( Color_con1 > -1.41751 )
									ret := 0.328413
							if( sDev > 0.750094 )
								if( sDev <= 0.908344 )
									ret := -0.254491
								if( sDev > 0.908344 )
									ret := 0.006046
					if( wvf > 1.37507 )
						if( sDev <= 0.67608 )
							if( upperBand <= 1.61131 )
								if( Color_con2 <= 0.126367 )
									ret := -0.916667 // sell
								if( Color_con2 > 0.126367 )
									ret := 0.000000
							if( upperBand > 1.61131 )
								if( lowerBand <= 0.651189 )
									ret := 0.611111
								if( lowerBand > 0.651189 )
									ret := 0.132231
						if( sDev > 0.67608 )
							if( midLine <= 1.37613 )
								if( sDev <= 0.782203 )
									ret := 0.533333
								if( sDev > 0.782203 )
									ret := -0.750000 // sell
							if( midLine > 1.37613 )
								if( sDev <= 2.45864 )
									ret := -0.224784
								if( sDev > 2.45864 )
									ret := 0.833333 // buy
	if( wvf > 1.5797 )
		if( Color_con2 <= -18.839 )
			if( wvf <= 6.09097 )
				if( upperBand <= 36.6343 )
					ret := -1.000000 // sell
				if( upperBand > 36.6343 )
					ret := -0.750000 // sell
			if( wvf > 6.09097 )
				ret := -0.500000
		if( Color_con2 > -18.839 )
			if( Color_con1 <= -5.14618 )
				if( upperBand <= 14.9714 )
					if( Color_con2 <= -3.83452 )
						if( upperBand <= 8.28317 )
							if( Color_con1 <= -5.49486 )
								if( lowerBand <= -2.2509 )
									ret := 1.000000 // buy
								if( lowerBand > -2.2509 )
									ret := -0.481481
							if( Color_con1 > -5.49486 )
								if( sDev <= 4.08365 )
									ret := -0.111111
								if( sDev > 4.08365 )
									ret := 0.800000 // buy
						if( upperBand > 8.28317 )
							if( sDev <= 6.72562 )
								if( Color_con1 <= -10.9534 )
									ret := -0.535714
								if( Color_con1 > -10.9534 )
									ret := 0.185741
							if( sDev > 6.72562 )
								if( lowerBand <= -0.46612 )
									ret := 0.680672
								if( lowerBand > -0.46612 )
									ret := -0.500000
					if( Color_con2 > -3.83452 )
						if( Color_con2 <= -3.55117 )
							if( upperBand <= 13.3009 )
								if( lowerBand <= 4.46848 )
									ret := 0.567416
								if( lowerBand > 4.46848 )
									ret := -0.040000
							if( upperBand > 13.3009 )
								if( Color_con2 <= -3.5879 )
									ret := 1.000000 // buy
								if( Color_con2 > -3.5879 )
									ret := 0.750000 // buy
						if( Color_con2 > -3.55117 )
							if( midLine <= 4.07257 )
								if( midLine <= 3.48111 )
									ret := 0.075472
								if( midLine > 3.48111 )
									ret := 0.804348 // buy
							if( midLine > 4.07257 )
								if( upperBand <= 8.02391 )
									ret := -0.245614
								if( upperBand > 8.02391 )
									ret := 0.215152
				if( upperBand > 14.9714 )
					if( Color_con2 <= -10.6216 )
						if( upperBand <= 16.8591 )
							ret := -0.833333 // sell
						if( upperBand > 16.8591 )
							if( lowerBand <= 1.17305 )
								if( lowerBand <= -0.688089 )
									ret := 0.750000 // buy
								if( lowerBand > -0.688089 )
									ret := 1.000000 // buy
							if( lowerBand > 1.17305 )
								ret := 0.500000
					if( Color_con2 > -10.6216 )
						if( Color_con2 <= -7.757 )
							if( Color_con1 <= -15.4551 )
								ret := 0.400000
							if( Color_con1 > -15.4551 )
								if( wvf <= 2.68776 )
									ret := -0.541667
								if( wvf > 2.68776 )
									ret := -0.933333 // sell
						if( Color_con2 > -7.757 )
							if( midLine <= 9.83107 )
								if( sDev <= 7.05887 )
									ret := -0.787879 // sell
								if( sDev > 7.05887 )
									ret := -0.147059
							if( midLine > 9.83107 )
								if( wvf <= 22.6649 )
									ret := 0.202247
								if( wvf > 22.6649 )
									ret := 0.923077 // buy
			if( Color_con1 > -5.14618 )
				if( Color_con2 <= -5.99285 )
					if( wvf <= 3.07949 )
						if( Color_con1 <= -4.10832 )
							if( upperBand <= 6.77119 )
								if( Color_con2 <= -6.62842 )
									ret := -0.916667 // sell
								if( Color_con2 > -6.62842 )
									ret := 0.000000
							if( upperBand > 6.77119 )
								ret := 0.500000
						if( Color_con1 > -4.10832 )
							if( sDev <= 1.70006 )
								if( upperBand <= 3.4179 )
									ret := 0.190476
								if( upperBand > 3.4179 )
									ret := -0.851852 // sell
							if( sDev > 1.70006 )
								if( wvf <= 2.46248 )
									ret := 0.631148
								if( wvf > 2.46248 )
									ret := -0.296296
					if( wvf > 3.07949 )
						if( Color_con2 <= -7.02101 )
							if( sDev <= 2.03907 )
								ret := -0.333333
							if( sDev > 2.03907 )
								if( upperBand <= 9.6368 )
									ret := 0.881188 // buy
								if( upperBand > 9.6368 )
									ret := 0.000000
						if( Color_con2 > -7.02101 )
							if( Color_con2 <= -6.1157 )
								if( upperBand <= 7.16929 )
									ret := -0.083333
								if( upperBand > 7.16929 )
									ret := 0.500000
							if( Color_con2 > -6.1157 )
								ret := 1.000000 // buy
				if( Color_con2 > -5.99285 )
					if( Color_con2 <= 7.37135 )
						if( lowerBand <= 0.034846 )
							if( Color_con1 <= -0.916892 )
								if( Color_con2 <= -0.064829 )
									ret := 0.049405
								if( Color_con2 > -0.064829 )
									ret := -0.072525
							if( Color_con1 > -0.916892 )
								if( Color_con2 <= -2.20327 )
									ret := -0.224033
								if( Color_con2 > -2.20327 )
									ret := 0.073023
						if( lowerBand > 0.034846 )
							if( lowerBand <= 0.66316 )
								if( upperBand <= 3.82224 )
									ret := 0.106468
								if( upperBand > 3.82224 )
									ret := 0.187837
							if( lowerBand > 0.66316 )
								if( midLine <= 2.0167 )
									ret := -0.111765
								if( midLine > 2.0167 )
									ret := 0.053364
					if( Color_con2 > 7.37135 )
						if( midLine <= 1.44445 )
							ret := -1.000000 // sell
						if( midLine > 1.44445 )
							if( Color_con1 <= -0.828063 )
								ret := 0.000000
							if( Color_con1 > -0.828063 )
								if( sDev <= 4.21194 )
									ret := 0.000000
								if( sDev > 4.21194 )
									ret := 0.897959 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_AMD_30Min_46277690(rangeHigh, rangeLow, midLine, sDev, lowerBand, wvf, Color_con1, colInt, Color_con2, upperBand)

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


