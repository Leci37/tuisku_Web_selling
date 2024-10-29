//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Williams_Vix_Fix
// ID_model: NVDA_30Min_1WIL_2f71e50b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NVDA_30Min_1WIL_2f71e50b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NVDA_30Min_2f71e50b(sDev, Color_con1, lowerBand, wvf, upperBand, midLine, Color_con2, rangeLow, colInt, rangeHigh)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( wvf <= 3.36746 )
		if( upperBand <= 8.1651 )
			if( sDev <= 3.48066 )
				if( Color_con2 <= 0.875277 )
					if( lowerBand <= -1.81168 )
						if( Color_con2 <= -2.2318 )
							ret := -0.400000
						if( Color_con2 > -2.2318 )
							if( midLine <= 0.947942 )
								ret := 0.600000
							if( midLine > 0.947942 )
								if( lowerBand <= -1.98483 )
									ret := 1.000000 // buy
								if( lowerBand > -1.98483 )
									ret := 0.777778 // buy
					if( lowerBand > -1.81168 )
						if( midLine <= 0.708188 )
							if( upperBand <= 1.3311 )
								if( Color_con1 <= -1.14703 )
									ret := 0.282297
								if( Color_con1 > -1.14703 )
									ret := 0.000151
							if( upperBand > 1.3311 )
								if( upperBand <= 1.75735 )
									ret := 0.149275
								if( upperBand > 1.75735 )
									ret := -0.042747
						if( midLine > 0.708188 )
							if( Color_con2 <= -1.50056 )
								if( Color_con2 <= -2.78288 )
									ret := -0.019026
								if( Color_con2 > -2.78288 )
									ret := 0.054015
							if( Color_con2 > -1.50056 )
								if( sDev <= 0.716243 )
									ret := 0.073642
								if( sDev > 0.716243 )
									ret := -0.033571
				if( Color_con2 > 0.875277 )
					if( upperBand <= 3.54421 )
						if( lowerBand <= 0.20466 )
							if( Color_con2 <= 2.2885 )
								if( Color_con1 <= 0.385511 )
									ret := 0.075893
								if( Color_con1 > 0.385511 )
									ret := 0.251956
							if( Color_con2 > 2.2885 )
								ret := -1.000000 // sell
						if( lowerBand > 0.20466 )
							if( Color_con1 <= 0.055755 )
								if( sDev <= 1.3116 )
									ret := 0.535714
								if( sDev > 1.3116 )
									ret := 0.904762 // buy
							if( Color_con1 > 0.055755 )
								if( Color_con2 <= 0.937006 )
									ret := -0.055556
								if( Color_con2 > 0.937006 )
									ret := 0.614583
					if( upperBand > 3.54421 )
						if( lowerBand <= -0.356452 )
							if( Color_con2 <= 1.65192 )
								if( Color_con1 <= -1.073 )
									ret := 0.488372
								if( Color_con1 > -1.073 )
									ret := -0.162162
							if( Color_con2 > 1.65192 )
								if( lowerBand <= -1.36905 )
									ret := 0.363636
								if( lowerBand > -1.36905 )
									ret := 0.956522 // buy
						if( lowerBand > -0.356452 )
							if( Color_con1 <= -0.554503 )
								if( lowerBand <= -0.153478 )
									ret := -0.571429
								if( lowerBand > -0.153478 )
									ret := -0.975000 // sell
							if( Color_con1 > -0.554503 )
								ret := -0.142857
			if( sDev > 3.48066 )
				if( Color_con1 <= -7.41858 )
					if( wvf <= 0.265975 )
						if( lowerBand <= -0.633421 )
							ret := 0.500000
						if( lowerBand > -0.633421 )
							ret := 0.636364
					if( wvf > 0.265975 )
						if( sDev <= 4.4735 )
							if( lowerBand <= -0.616686 )
								ret := 1.000000 // buy
							if( lowerBand > -0.616686 )
								ret := 0.928571 // buy
						if( sDev > 4.4735 )
							ret := 0.636364
				if( Color_con1 > -7.41858 )
					if( Color_con1 <= -5.89337 )
						if( wvf <= 0.804404 )
							if( Color_con1 <= -6.23586 )
								if( Color_con2 <= -6.17453 )
									ret := 0.627907
								if( Color_con2 > -6.17453 )
									ret := 0.043243
							if( Color_con1 > -6.23586 )
								if( lowerBand <= -1.11686 )
									ret := -0.729167 // sell
								if( lowerBand > -1.11686 )
									ret := -0.311475
						if( wvf > 0.804404 )
							if( sDev <= 4.05637 )
								if( wvf <= 1.21116 )
									ret := 0.652174
								if( wvf > 1.21116 )
									ret := 0.227273
							if( sDev > 4.05637 )
								if( sDev <= 4.18212 )
									ret := -0.783784 // sell
								if( sDev > 4.18212 )
									ret := 0.327103
					if( Color_con1 > -5.89337 )
						if( wvf <= 0.244552 )
							if( wvf <= 0.140145 )
								ret := 0.000000
							if( wvf > 0.140145 )
								if( sDev <= 3.61708 )
									ret := -0.869565 // sell
								if( sDev > 3.61708 )
									ret := -0.650000
						if( wvf > 0.244552 )
							if( Color_con2 <= -0.131551 )
								if( Color_con1 <= -4.86618 )
									ret := 0.521905
								if( Color_con1 > -4.86618 )
									ret := 0.299685
							if( Color_con2 > -0.131551 )
								if( sDev <= 3.55649 )
									ret := -1.000000 // sell
								if( sDev > 3.55649 )
									ret := -0.375000
		if( upperBand > 8.1651 )
			if( wvf <= 1.19963 )
				if( sDev <= 5.259 )
					if( sDev <= 4.0767 )
						if( wvf <= 0.739536 )
							ret := -0.157895
						if( wvf > 0.739536 )
							if( Color_con1 <= -7.85272 )
								ret := 0.400000
							if( Color_con1 > -7.85272 )
								if( Color_con1 <= -7.54266 )
									ret := 1.000000 // buy
								if( Color_con1 > -7.54266 )
									ret := 0.545455
					if( sDev > 4.0767 )
						if( upperBand <= 10.1182 )
							if( sDev <= 4.85563 )
								if( upperBand <= 8.44934 )
									ret := -0.891892 // sell
								if( upperBand > 8.44934 )
									ret := -0.475610
							if( sDev > 4.85563 )
								if( Color_con2 <= -4.50983 )
									ret := -0.491228
								if( Color_con2 > -4.50983 )
									ret := 0.454545
						if( upperBand > 10.1182 )
							ret := 0.454545
				if( sDev > 5.259 )
					if( Color_con2 <= -6.76938 )
						if( lowerBand <= -2.00117 )
							if( midLine <= 3.38535 )
								ret := -0.722222 // sell
							if( midLine > 3.38535 )
								if( Color_con2 <= -9.65948 )
									ret := 0.796296 // buy
								if( Color_con2 > -9.65948 )
									ret := -0.142857
						if( lowerBand > -2.00117 )
							if( upperBand <= 9.87067 )
								ret := 0.571429
							if( upperBand > 9.87067 )
								if( Color_con2 <= -7.8822 )
									ret := 0.022727
								if( Color_con2 > -7.8822 )
									ret := -0.633333
					if( Color_con2 > -6.76938 )
						if( Color_con2 <= -5.67598 )
							if( sDev <= 5.69284 )
								if( Color_con2 <= -6.38102 )
									ret := -0.555556
								if( Color_con2 > -6.38102 )
									ret := 0.800000 // buy
							if( sDev > 5.69284 )
								if( wvf <= 0.960961 )
									ret := 0.968421 // buy
								if( wvf > 0.960961 )
									ret := 0.692308
						if( Color_con2 > -5.67598 )
							if( wvf <= 1.00687 )
								ret := -1.000000 // sell
							if( wvf > 1.00687 )
								if( Color_con2 <= -4.37015 )
									ret := -0.875000 // sell
								if( Color_con2 > -4.37015 )
									ret := 0.954545 // buy
			if( wvf > 1.19963 )
				if( lowerBand <= 1.65617 )
					if( wvf <= 1.52701 )
						if( Color_con1 <= -9.58115 )
							if( Color_con1 <= -13.064 )
								if( lowerBand <= -3.0169 )
									ret := -0.222222
								if( lowerBand > -3.0169 )
									ret := -0.886364 // sell
							if( Color_con1 > -13.064 )
								if( Color_con2 <= -8.17127 )
									ret := 0.964286 // buy
								if( Color_con2 > -8.17127 )
									ret := -0.333333
						if( Color_con1 > -9.58115 )
							if( Color_con2 <= -5.66065 )
								if( upperBand <= 9.81592 )
									ret := -0.574468
								if( upperBand > 9.81592 )
									ret := -1.000000 // sell
							if( Color_con2 > -5.66065 )
								if( Color_con2 <= -5.45538 )
									ret := 0.166667
								if( Color_con2 > -5.45538 )
									ret := -0.705882 // sell
					if( wvf > 1.52701 )
						if( wvf <= 3.3166 )
							if( wvf <= 2.45847 )
								if( upperBand <= 10.434 )
									ret := -0.442177
								if( upperBand > 10.434 )
									ret := 0.312500
							if( wvf > 2.45847 )
								if( Color_con2 <= -3.61983 )
									ret := -0.169935
								if( Color_con2 > -3.61983 )
									ret := 0.693878
						if( wvf > 3.3166 )
							if( Color_con1 <= -7.28409 )
								ret := 0.285714
							if( Color_con1 > -7.28409 )
								ret := 0.947368 // buy
				if( lowerBand > 1.65617 )
					if( wvf <= 2.62127 )
						if( upperBand <= 8.46646 )
							ret := 0.200000
						if( upperBand > 8.46646 )
							if( upperBand <= 9.14281 )
								ret := -1.000000 // sell
							if( upperBand > 9.14281 )
								if( lowerBand <= 3.61803 )
									ret := -0.496403
								if( lowerBand > 3.61803 )
									ret := -0.750000 // sell
					if( wvf > 2.62127 )
						if( sDev <= 4.49718 )
							if( midLine <= 6.42986 )
								if( Color_con2 <= -3.66022 )
									ret := -0.131579
								if( Color_con2 > -3.66022 )
									ret := -1.000000 // sell
							if( midLine > 6.42986 )
								if( lowerBand <= 4.11977 )
									ret := -0.923077 // sell
								if( lowerBand > 4.11977 )
									ret := -0.333333
						if( sDev > 4.49718 )
							if( sDev <= 5.13239 )
								if( Color_con1 <= -9.19585 )
									ret := 1.000000 // buy
								if( Color_con1 > -9.19585 )
									ret := 0.642857
							if( sDev > 5.13239 )
								if( upperBand <= 14.9897 )
									ret := -0.916667 // sell
								if( upperBand > 14.9897 )
									ret := -0.176471
	if( wvf > 3.36746 )
		if( lowerBand <= 4.2033 )
			if( lowerBand <= -35.8219 )
				if( lowerBand <= -41.4534 )
					if( lowerBand <= -44.5257 )
						ret := -0.722222 // sell
					if( lowerBand > -44.5257 )
						ret := -0.583333
				if( lowerBand > -41.4534 )
					ret := -1.000000 // sell
			if( lowerBand > -35.8219 )
				if( sDev <= 6.66635 )
					if( sDev <= 2.58821 )
						if( wvf <= 4.27795 )
							if( lowerBand <= -0.69245 )
								if( midLine <= 0.657605 )
									ret := -0.583333
								if( midLine > 0.657605 )
									ret := 0.204981
							if( lowerBand > -0.69245 )
								if( Color_con2 <= 2.28931 )
									ret := -0.171660
								if( Color_con2 > 2.28931 )
									ret := 0.804878 // buy
						if( wvf > 4.27795 )
							if( Color_con1 <= 1.70272 )
								if( wvf <= 4.28271 )
									ret := 0.777778 // buy
								if( wvf > 4.28271 )
									ret := 0.093354
							if( Color_con1 > 1.70272 )
								if( upperBand <= 3.21662 )
									ret := -0.887097 // sell
								if( upperBand > 3.21662 )
									ret := -0.318182
					if( sDev > 2.58821 )
						if( Color_con2 <= -1.56858 )
							if( colInt <= 0.5 )
								if( wvf <= 6.68629 )
									ret := 0.133636
								if( wvf > 6.68629 )
									ret := -0.705882 // sell
							if( colInt > 0.5 )
								if( wvf <= 6.86327 )
									ret := -0.307692
								if( wvf > 6.86327 )
									ret := -0.911765 // sell
						if( Color_con2 > -1.56858 )
							if( upperBand <= 6.69743 )
								if( lowerBand <= -0.977599 )
									ret := 0.035604
								if( lowerBand > -0.977599 )
									ret := -0.196031
							if( upperBand > 6.69743 )
								if( upperBand <= 13.3707 )
									ret := -0.249489
								if( upperBand > 13.3707 )
									ret := 0.463768
				if( sDev > 6.66635 )
					if( sDev <= 6.82709 )
						if( midLine <= 3.95343 )
							ret := 0.454545
						if( midLine > 3.95343 )
							if( wvf <= 10.169 )
								ret := 1.000000 // buy
							if( wvf > 10.169 )
								ret := 0.769231 // buy
					if( sDev > 6.82709 )
						if( Color_con2 <= 1.09833 )
							if( Color_con1 <= -12.0943 )
								if( midLine <= 13.6815 )
									ret := 0.781250 // buy
								if( midLine > 13.6815 )
									ret := 0.333333
							if( Color_con1 > -12.0943 )
								if( Color_con2 <= 0.22829 )
									ret := -0.043243
								if( Color_con2 > 0.22829 )
									ret := -0.531746
						if( Color_con2 > 1.09833 )
							if( Color_con1 <= 2.35879 )
								if( lowerBand <= -4.50339 )
									ret := -0.114286
								if( lowerBand > -4.50339 )
									ret := 0.617978
							if( Color_con1 > 2.35879 )
								if( upperBand <= 11.4728 )
									ret := -1.000000 // sell
								if( upperBand > 11.4728 )
									ret := -0.272727
		if( lowerBand > 4.2033 )
			if( midLine <= 10.016 )
				if( wvf <= 11.1961 )
					if( wvf <= 9.81882 )
						if( upperBand <= 9.06442 )
							if( sDev <= 1.77829 )
								if( midLine <= 7.10623 )
									ret := 0.167665
								if( midLine > 7.10623 )
									ret := 0.875000 // buy
							if( sDev > 1.77829 )
								if( midLine <= 6.63209 )
									ret := 0.153846
								if( midLine > 6.63209 )
									ret := -0.830508 // sell
						if( upperBand > 9.06442 )
							if( sDev <= 2.2716 )
								if( Color_con1 <= -3.84728 )
									ret := -0.250000
								if( Color_con1 > -3.84728 )
									ret := 0.857143 // buy
							if( sDev > 2.2716 )
								if( wvf <= 6.76775 )
									ret := 0.079755
								if( wvf > 6.76775 )
									ret := 0.560284
					if( wvf > 9.81882 )
						if( sDev <= 2.753 )
							ret := -1.000000 // sell
						if( sDev > 2.753 )
							ret := 0.000000
				if( wvf > 11.1961 )
					ret := 1.000000 // buy
			if( midLine > 10.016 )
				if( upperBand <= 14.6721 )
					if( sDev <= 4.01649 )
						if( lowerBand <= 7.75685 )
							if( wvf <= 9.91829 )
								ret := -1.000000 // sell
							if( wvf > 9.91829 )
								ret := -0.928571 // sell
						if( lowerBand > 7.75685 )
							if( sDev <= 2.43986 )
								ret := -0.888889 // sell
							if( sDev > 2.43986 )
								if( upperBand <= 13.1925 )
									ret := 0.250000
								if( upperBand > 13.1925 )
									ret := -0.900000 // sell
					if( sDev > 4.01649 )
						ret := -0.076923
				if( upperBand > 14.6721 )
					if( midLine <= 76.914 )
						if( wvf <= 10.6945 )
							if( wvf <= 7.88512 )
								if( lowerBand <= 5.48047 )
									ret := 1.000000 // buy
								if( lowerBand > 5.48047 )
									ret := 0.100000
							if( wvf > 7.88512 )
								ret := -0.928571 // sell
						if( wvf > 10.6945 )
							if( upperBand <= 20.9856 )
								if( colInt <= 0.5 )
									ret := 0.944444 // buy
								if( colInt > 0.5 )
									ret := 0.571429
							if( upperBand > 20.9856 )
								ret := 1.000000 // buy
					if( midLine > 76.914 )
						ret := -0.727273 // sell
	
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
float op_operation = decision_tree_0_NVDA_30Min_2f71e50b(sDev, Color_con1, lowerBand, wvf, upperBand, midLine, Color_con2, rangeLow, colInt, rangeHigh)

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


