//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Wave_Trend_Calculation
// ID_model: EPAM_15Min_1WAV_74646748 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_EPAM_15Min_1WAV_74646748", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_EPAM_15Min_74646748(d, esa, d_tci, ci_wt2, wt2, ci, ap, tci)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ci_wt2 <= -143.826 )
		if( d <= 3.56564 )
			if( ap <= 252.894 )
				if( wt2 <= 31.5946 )
					if( ap <= 116.613 )
						if( ci <= -126.171 )
							if( d <= 0.497861 )
								if( esa <= 103.489 )
									ret := 0.284314
								if( esa > 103.489 )
									ret := 0.729167 // buy
							if( d > 0.497861 )
								if( ci_wt2 <= -217.175 )
									ret := 1.000000 // buy
								if( ci_wt2 > -217.175 )
									ret := -0.636364
						if( ci > -126.171 )
							if( ci <= -121.989 )
								ret := -1.000000 // sell
							if( ci > -121.989 )
								if( ap <= 80.2685 )
									ret := -0.600000
								if( ap > 80.2685 )
									ret := 0.000000
					if( ap > 116.613 )
						if( ci_wt2 <= -164.46 )
							if( ci <= -180.543 )
								if( ap <= 224.883 )
									ret := 0.132812
								if( ap > 224.883 )
									ret := -0.722222 // sell
							if( ci > -180.543 )
								if( wt2 <= 13.2517 )
									ret := -0.804878 // sell
								if( wt2 > 13.2517 )
									ret := -0.250000
						if( ci_wt2 > -164.46 )
							if( ap <= 192.281 )
								if( ci <= -131.011 )
									ret := -0.492063
								if( ci > -131.011 )
									ret := 0.250000
							if( ap > 192.281 )
								if( ci_wt2 <= -153.134 )
									ret := 0.735849 // buy
								if( ci_wt2 > -153.134 )
									ret := 0.239130
				if( wt2 > 31.5946 )
					if( ci <= -112.061 )
						if( d <= 0.117624 )
							ret := -0.200000
						if( d > 0.117624 )
							if( ap <= 115.302 )
								if( ci_wt2 <= -155.109 )
									ret := 0.811321 // buy
								if( ci_wt2 > -155.109 )
									ret := 0.250000
							if( ap > 115.302 )
								if( d <= 0.867314 )
									ret := 0.327869
								if( d > 0.867314 )
									ret := 0.789474 // buy
					if( ci > -112.061 )
						if( ap <= 188.173 )
							if( tci <= 27.0772 )
								if( d <= 0.311814 )
									ret := 0.000000
								if( d > 0.311814 )
									ret := -0.600000
							if( tci > 27.0772 )
								if( d_tci <= -41.027 )
									ret := -0.250000
								if( d_tci > -41.027 )
									ret := 0.714286 // buy
						if( ap > 188.173 )
							if( d <= 0.57345 )
								ret := -0.857143 // sell
							if( d > 0.57345 )
								ret := -0.142857
			if( ap > 252.894 )
				if( ci_wt2 <= -161.205 )
					if( ci_wt2 <= -198.463 )
						if( esa <= 558.511 )
							if( esa <= 341.47 )
								if( ap <= 329.738 )
									ret := 0.483871
								if( ap > 329.738 )
									ret := -0.750000 // sell
							if( esa > 341.47 )
								if( ci <= -215.835 )
									ret := 0.877551 // buy
								if( ci > -215.835 )
									ret := 0.609756
						if( esa > 558.511 )
							if( ci <= -232.97 )
								ret := -1.000000 // sell
							if( ci > -232.97 )
								ret := 0.142857
					if( ci_wt2 > -198.463 )
						if( ci <= -124.99 )
							if( ap <= 260.911 )
								if( d_tci <= 26.5921 )
									ret := 0.555556
								if( d_tci > 26.5921 )
									ret := 1.000000 // buy
							if( ap > 260.911 )
								if( tci <= -22.4262 )
									ret := 0.333333
								if( tci > -22.4262 )
									ret := 0.030928
						if( ci > -124.99 )
							if( ap <= 371.209 )
								ret := -0.166667
							if( ap > 371.209 )
								ret := -1.000000 // sell
				if( ci_wt2 > -161.205 )
					if( d_tci <= 31.0491 )
						if( tci <= 7.07451 )
							if( ap <= 258.662 )
								ret := -0.750000 // sell
							if( ap > 258.662 )
								if( d_tci <= 6.84546 )
									ret := 0.898551 // buy
								if( d_tci > 6.84546 )
									ret := 0.542373
						if( tci > 7.07451 )
							if( tci <= 17.9613 )
								if( d_tci <= -11.9721 )
									ret := -0.375000
								if( d_tci > -11.9721 )
									ret := 0.400000
							if( tci > 17.9613 )
								if( d_tci <= -25.258 )
									ret := 0.181818
								if( d_tci > -25.258 )
									ret := 0.823529 // buy
					if( d_tci > 31.0491 )
						if( tci <= -42.1259 )
							if( ap <= 337.131 )
								ret := 0.285714
							if( ap > 337.131 )
								if( d_tci <= 48.8515 )
									ret := 0.750000 // buy
								if( d_tci > 48.8515 )
									ret := 1.000000 // buy
						if( tci > -42.1259 )
							if( d <= 2.08586 )
								if( ap <= 290.666 )
									ret := -1.000000 // sell
								if( ap > 290.666 )
									ret := 0.250000
							if( d > 2.08586 )
								if( ap <= 585.01 )
									ret := -1.000000 // sell
								if( ap > 585.01 )
									ret := 0.000000
		if( d > 3.56564 )
			if( esa <= 183.932 )
				ret := 1.000000 // buy
			if( esa > 183.932 )
				if( wt2 <= 10.5356 )
					if( ci_wt2 <= -193.946 )
						ret := -1.000000 // sell
					if( ci_wt2 > -193.946 )
						if( esa <= 591.912 )
							if( ap <= 411.314 )
								if( esa <= 360.805 )
									ret := 0.166667
								if( esa > 360.805 )
									ret := -1.000000 // sell
							if( ap > 411.314 )
								ret := 0.833333 // buy
						if( esa > 591.912 )
							if( esa <= 654.429 )
								ret := -1.000000 // sell
							if( esa > 654.429 )
								ret := -0.750000 // sell
				if( wt2 > 10.5356 )
					if( esa <= 271.976 )
						if( wt2 <= 27.8276 )
							ret := -0.500000
						if( wt2 > 27.8276 )
							ret := -1.000000 // sell
					if( esa > 271.976 )
						if( d <= 4.65383 )
							if( esa <= 356.954 )
								ret := 0.600000
							if( esa > 356.954 )
								if( d_tci <= -10.7909 )
									ret := 0.500000
								if( d_tci > -10.7909 )
									ret := -0.500000
						if( d > 4.65383 )
							ret := 1.000000 // buy
	if( ci_wt2 > -143.826 )
		if( esa <= 669.941 )
			if( d_tci <= 4.82766 )
				if( ci <= 21.6582 )
					if( d <= 0.606462 )
						if( ci <= -100.489 )
							if( d_tci <= 4.03612 )
								if( ci <= -123.075 )
									ret := 0.375000
								if( ci > -123.075 )
									ret := -0.308901
							if( d_tci > 4.03612 )
								if( ci <= -109.271 )
									ret := 0.833333 // buy
								if( ci > -109.271 )
									ret := 0.000000
						if( ci > -100.489 )
							if( esa <= 255.43 )
								if( d <= 0.112885 )
									ret := -0.014925
								if( d > 0.112885 )
									ret := 0.096703
							if( esa > 255.43 )
								if( esa <= 318.352 )
									ret := -0.114155
								if( esa > 318.352 )
									ret := 0.087097
					if( d > 0.606462 )
						if( ap <= 222.666 )
							if( ap <= 214.633 )
								if( ap <= 189.876 )
									ret := 0.321357
								if( ap > 189.876 )
									ret := 0.096436
							if( ap > 214.633 )
								if( d_tci <= 3.20945 )
									ret := 0.666667
								if( d_tci > 3.20945 )
									ret := -1.000000 // sell
						if( ap > 222.666 )
							if( esa <= 264.61 )
								if( ci <= -96.0259 )
									ret := 0.627119
								if( ci > -96.0259 )
									ret := -0.061333
							if( esa > 264.61 )
								if( ap <= 299.403 )
									ret := 0.293194
								if( ap > 299.403 )
									ret := 0.113697
				if( ci > 21.6582 )
					if( wt2 <= 47.7177 )
						if( esa <= 305.464 )
							if( esa <= 304.823 )
								if( wt2 <= -4.47896 )
									ret := 0.187039
								if( wt2 > -4.47896 )
									ret := 0.077063
							if( esa > 304.823 )
								if( ci_wt2 <= 73.6197 )
									ret := 0.789474 // buy
								if( ci_wt2 > 73.6197 )
									ret := 0.000000
						if( esa > 305.464 )
							if( esa <= 464.621 )
								if( ap <= 460.937 )
									ret := -0.022072
								if( ap > 460.937 )
									ret := -0.720588 // sell
							if( esa > 464.621 )
								if( esa <= 478.18 )
									ret := 0.672727
								if( esa > 478.18 )
									ret := 0.133387
					if( wt2 > 47.7177 )
						if( d <= 4.87357 )
							if( ap <= 72.0372 )
								if( ap <= 64.1194 )
									ret := 0.500000
								if( ap > 64.1194 )
									ret := -0.424460
							if( ap > 72.0372 )
								if( ap <= 112.247 )
									ret := 0.091954
								if( ap > 112.247 )
									ret := -0.024266
						if( d > 4.87357 )
							if( wt2 <= 76.2437 )
								if( ci <= 52.7489 )
									ret := 0.494382
								if( ci > 52.7489 )
									ret := -0.132948
							if( wt2 > 76.2437 )
								if( ci <= 36.9191 )
									ret := -0.400000
								if( ci > 36.9191 )
									ret := 0.761905 // buy
			if( d_tci > 4.82766 )
				if( d <= 10.1339 )
					if( wt2 <= -59.6213 )
						if( esa <= 314.669 )
							if( wt2 <= -79.1396 )
								if( esa <= 196.695 )
									ret := -0.622222
								if( esa > 196.695 )
									ret := 0.281250
							if( wt2 > -79.1396 )
								if( d <= 5.55827 )
									ret := 0.209201
								if( d > 5.55827 )
									ret := -0.522388
						if( esa > 314.669 )
							if( ci_wt2 <= 24.6576 )
								if( d <= 1.86468 )
									ret := 0.676471
								if( d > 1.86468 )
									ret := -0.217905
							if( ci_wt2 > 24.6576 )
								if( esa <= 320.115 )
									ret := -0.454545
								if( esa > 320.115 )
									ret := 0.308244
					if( wt2 > -59.6213 )
						if( ap <= 65.3176 )
							if( d <= 0.152372 )
								if( ci_wt2 <= 81.3097 )
									ret := 0.393665
								if( ci_wt2 > 81.3097 )
									ret := -0.250000
							if( d > 0.152372 )
								if( ci <= -129.089 )
									ret := 0.900000 // buy
								if( ci > -129.089 )
									ret := 0.000000
						if( ap > 65.3176 )
							if( esa <= 138.601 )
								if( ci <= -137.604 )
									ret := 0.418605
								if( ci > -137.604 )
									ret := -0.054335
							if( esa > 138.601 )
								if( ap <= 164.36 )
									ret := 0.247984
								if( ap > 164.36 )
									ret := 0.017082
				if( d > 10.1339 )
					if( wt2 <= -68.2888 )
						if( tci <= -70.0073 )
							if( esa <= 288.628 )
								if( ci <= -69.976 )
									ret := 0.000000
								if( ci > -69.976 )
									ret := -1.000000 // sell
							if( esa > 288.628 )
								if( esa <= 376.059 )
									ret := 0.750000 // buy
								if( esa > 376.059 )
									ret := -0.400000
						if( tci > -70.0073 )
							if( ci_wt2 <= 24.4186 )
								ret := 0.500000
							if( ci_wt2 > 24.4186 )
								ret := 1.000000 // buy
					if( wt2 > -68.2888 )
						if( ci <= -71.9601 )
							if( ci <= -93.3743 )
								if( tci <= -66.3046 )
									ret := -1.000000 // sell
								if( tci > -66.3046 )
									ret := 0.000000
							if( ci > -93.3743 )
								ret := 0.500000
						if( ci > -71.9601 )
							if( esa <= 198.172 )
								ret := -0.600000
							if( esa > 198.172 )
								if( d <= 16.485 )
									ret := -1.000000 // sell
								if( d > 16.485 )
									ret := -0.750000 // sell
		if( esa > 669.941 )
			if( d <= 4.67825 )
				if( tci <= -22.245 )
					if( ci_wt2 <= -53.299 )
						if( d <= 2.82381 )
							if( ap <= 671.997 )
								ret := -1.000000 // sell
							if( ap > 671.997 )
								if( ap <= 688.875 )
									ret := 0.000000
								if( ap > 688.875 )
									ret := 0.250000
						if( d > 2.82381 )
							if( wt2 <= -18.2829 )
								ret := -1.000000 // sell
							if( wt2 > -18.2829 )
								ret := -0.500000
					if( ci_wt2 > -53.299 )
						if( d <= 2.55651 )
							if( esa <= 673.593 )
								if( ap <= 670.64 )
									ret := 0.000000
								if( ap > 670.64 )
									ret := -0.750000 // sell
							if( esa > 673.593 )
								if( d <= 1.97629 )
									ret := 0.000000
								if( d > 1.97629 )
									ret := 0.200000
						if( d > 2.55651 )
							if( tci <= -30.7759 )
								if( ci <= 24.7865 )
									ret := 0.806452 // buy
								if( ci > 24.7865 )
									ret := 0.250000
							if( tci > -30.7759 )
								if( ap <= 679.246 )
									ret := -0.250000
								if( ap > 679.246 )
									ret := 0.200000
				if( tci > -22.245 )
					if( ci_wt2 <= 60.7364 )
						if( ap <= 698.91 )
							if( d <= 3.95815 )
								if( d <= 1.66163 )
									ret := -0.153846
								if( d > 1.66163 )
									ret := -0.730769 // sell
							if( d > 3.95815 )
								if( wt2 <= 22.3097 )
									ret := -0.500000
								if( wt2 > 22.3097 )
									ret := 1.000000 // buy
						if( ap > 698.91 )
							if( d <= 1.36796 )
								if( ci_wt2 <= -63.5713 )
									ret := -1.000000 // sell
								if( ci_wt2 > -63.5713 )
									ret := -0.400000
							if( d > 1.36796 )
								if( ci <= -31.8649 )
									ret := 0.437500
								if( ci > -31.8649 )
									ret := -0.189655
					if( ci_wt2 > 60.7364 )
						if( tci <= 22.7132 )
							if( d <= 1.12876 )
								ret := 0.000000
							if( d > 1.12876 )
								if( ap <= 712.374 )
									ret := -0.944444 // sell
								if( ap > 712.374 )
									ret := -0.714286 // sell
						if( tci > 22.7132 )
							if( d_tci <= -44.807 )
								ret := -1.000000 // sell
							if( d_tci > -44.807 )
								ret := 0.600000
			if( d > 4.67825 )
				if( ap <= 702.627 )
					if( ci <= -80.3161 )
						if( d <= 7.42636 )
							ret := -1.000000 // sell
						if( d > 7.42636 )
							ret := -0.400000
					if( ci > -80.3161 )
						if( tci <= -49.2823 )
							ret := -0.285714
						if( tci > -49.2823 )
							if( tci <= 66.6671 )
								if( wt2 <= 62.1253 )
									ret := 0.956522 // buy
								if( wt2 > 62.1253 )
									ret := 0.500000
							if( tci > 66.6671 )
								if( ci <= 60.3661 )
									ret := 0.000000
								if( ci > 60.3661 )
									ret := 0.500000
				if( ap > 702.627 )
					if( ap <= 711.161 )
						if( ci <= 44.246 )
							ret := -0.714286 // sell
						if( ci > 44.246 )
							ret := 0.000000
					if( ap > 711.161 )
						ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Wave_Trend_Calculation 
//@version=5
//indicator "WaveTrend [LazyBear]", shorttitle="WT_LB", overlay=false)

n1 = input.int(10, title="Channel Length")
n2 = input.int(21, title="Average Length")
obLevel1 = input.float(60, title="Over Bought Level 1")
obLevel2 = input.float(53, title="Over Bought Level 2")
osLevel1 = input.float(-60, title="Over Sold Level 1")
osLevel2 = input.float(-53, title="Over Sold Level 2")

ap = hlc3
esa = ta.ema(ap, n1)
d = ta.ema(math.abs(ap - esa), n1)
ci = (ap - esa) / (0.015 * d)
tci = ta.ema(ci, n2)

wt1 = tci
wt2 = ta.sma(wt1, 4)

d_tci = d-tci
ci_wt2 = ci - wt2

plot(0, color=color.gray)
plot(obLevel1, color=color.red)
plot(osLevel1, color=color.green)
plot(obLevel2, color=color.red, linewidth=2, style=plot.style_line, title="OB Level 2 (Dashed)", color=color.red)
plot(osLevel2, color=color.green, linewidth=2, style=plot.style_line, title="OS Level 2 (Dashed)", color=color.green)

plot(wt1, color=color.green, title="WT1")
plot(wt2, color=color.red, title="WT2", style=plot.style_line, linewidth=1)
plot(wt1 - wt2, color=color.new(color.blue, 80), title="WT1-WT2", style=plot.style_area)

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
float op_operation = decision_tree_0_EPAM_15Min_74646748(d, esa, d_tci, ci_wt2, wt2, ci, ap, tci)

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


