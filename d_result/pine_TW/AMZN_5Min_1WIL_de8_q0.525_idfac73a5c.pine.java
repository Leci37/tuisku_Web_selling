//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Williams_Vix_Fix
// ID_model: AMZN_5Min_1WIL_fac73a5c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMZN_5Min_1WIL_fac73a5c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMZN_5Min_fac73a5c(rangeHigh, rangeLow, midLine, sDev, lowerBand, wvf, Color_con1, colInt, Color_con2, upperBand)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( lowerBand <= 0.566203 )
		if( Color_con2 <= -0.321669 )
			if( wvf <= 2.24793 )
				if( upperBand <= 3.66259 )
					if( Color_con1 <= 0.000749 )
						if( sDev <= 1.70191 )
							if( wvf <= 1.659 )
								if( wvf <= 0.820954 )
									ret := 0.068182
								if( wvf > 0.820954 )
									ret := -0.097744
							if( wvf > 1.659 )
								if( lowerBand <= -0.053525 )
									ret := 0.250000
								if( lowerBand > -0.053525 )
									ret := 1.000000 // buy
						if( sDev > 1.70191 )
							if( Color_con2 <= -2.05746 )
								if( sDev <= 2.07458 )
									ret := 0.283333
								if( sDev > 2.07458 )
									ret := -0.303030
							if( Color_con2 > -2.05746 )
								if( lowerBand <= -0.747448 )
									ret := 0.000000
								if( lowerBand > -0.747448 )
									ret := -0.641975
					if( Color_con1 > 0.000749 )
						if( upperBand <= 0.12809 )
							if( wvf <= 0.12162 )
								ret := 0.000000
							if( wvf > 0.12162 )
								ret := -0.857143 // sell
						if( upperBand > 0.12809 )
							if( midLine <= 0.072158 )
								if( wvf <= 0.156024 )
									ret := 1.000000 // buy
								if( wvf > 0.156024 )
									ret := 0.650000
							if( midLine > 0.072158 )
								if( upperBand <= 0.472403 )
									ret := 0.134783
								if( upperBand > 0.472403 )
									ret := 0.370909
				if( upperBand > 3.66259 )
					if( wvf <= 0.342598 )
						if( midLine <= 1.70456 )
							if( Color_con1 <= -3.60673 )
								if( upperBand <= 4.07713 )
									ret := 0.900000 // buy
								if( upperBand > 4.07713 )
									ret := 0.000000
							if( Color_con1 > -3.60673 )
								if( Color_con2 <= -2.42564 )
									ret := 0.500000
								if( Color_con2 > -2.42564 )
									ret := -0.750000 // sell
						if( midLine > 1.70456 )
							if( Color_con1 <= -3.69321 )
								if( midLine <= 1.86422 )
									ret := 0.750000 // buy
								if( midLine > 1.86422 )
									ret := -0.304348
							if( Color_con1 > -3.69321 )
								if( sDev <= 1.95052 )
									ret := -0.500000
								if( sDev > 1.95052 )
									ret := -1.000000 // sell
					if( wvf > 0.342598 )
						if( wvf <= 0.803569 )
							if( Color_con1 <= -3.35894 )
								if( upperBand <= 3.90781 )
									ret := 0.052632
								if( upperBand > 3.90781 )
									ret := 0.650000
							if( Color_con1 > -3.35894 )
								if( sDev <= 2.18238 )
									ret := 0.750000 // buy
								if( sDev > 2.18238 )
									ret := 0.966667 // buy
						if( wvf > 0.803569 )
							if( sDev <= 2.33409 )
								if( lowerBand <= 0.272983 )
									ret := 0.710526 // buy
								if( lowerBand > 0.272983 )
									ret := -0.050000
							if( sDev > 2.33409 )
								if( wvf <= 1.05943 )
									ret := 1.000000 // buy
								if( wvf > 1.05943 )
									ret := -0.947368 // sell
			if( wvf > 2.24793 )
				if( Color_con1 <= -4.23142 )
					ret := -1.000000 // sell
				if( Color_con1 > -4.23142 )
					if( upperBand <= 5.86118 )
						ret := -1.000000 // sell
					if( upperBand > 5.86118 )
						ret := 0.000000
		if( Color_con2 > -0.321669 )
			if( Color_con1 <= -0.058539 )
				if( Color_con2 <= 2.04579 )
					if( upperBand <= 5.56653 )
						if( midLine <= 1.89094 )
							if( Color_con2 <= 0.837388 )
								if( Color_con1 <= -0.584901 )
									ret := -0.066603
								if( Color_con1 > -0.584901 )
									ret := 0.018128
							if( Color_con2 > 0.837388 )
								if( lowerBand <= -0.684068 )
									ret := 0.535714
								if( lowerBand > -0.684068 )
									ret := 0.118056
						if( midLine > 1.89094 )
							if( wvf <= 2.32845 )
								if( sDev <= 1.53233 )
									ret := -0.250000
								if( sDev > 1.53233 )
									ret := 1.000000 // buy
							if( wvf > 2.32845 )
								if( Color_con1 <= -0.637491 )
									ret := -0.838710 // sell
								if( Color_con1 > -0.637491 )
									ret := 0.250000
					if( upperBand > 5.56653 )
						if( midLine <= 5.55222 )
							if( wvf <= 3.37906 )
								if( wvf <= 1.45535 )
									ret := 0.696970
								if( wvf > 1.45535 )
									ret := -0.736842 // sell
							if( wvf > 3.37906 )
								if( sDev <= 5.27354 )
									ret := 0.900000 // buy
								if( sDev > 5.27354 )
									ret := 0.333333
						if( midLine > 5.55222 )
							ret := -1.000000 // sell
				if( Color_con2 > 2.04579 )
					if( sDev <= 3.19733 )
						ret := 1.000000 // buy
					if( sDev > 3.19733 )
						if( lowerBand <= -2.55513 )
							if( midLine <= 2.56129 )
								if( Color_con2 <= 3.05614 )
									ret := -0.444444
								if( Color_con2 > 3.05614 )
									ret := -1.000000 // sell
							if( midLine > 2.56129 )
								ret := 1.000000 // buy
						if( lowerBand > -2.55513 )
							if( wvf <= 2.96367 )
								ret := -0.750000 // sell
							if( wvf > 2.96367 )
								if( lowerBand <= -2.28637 )
									ret := -0.750000 // sell
								if( lowerBand > -2.28637 )
									ret := -1.000000 // sell
			if( Color_con1 > -0.058539 )
				if( midLine <= 0.412991 )
					if( Color_con1 <= 0.451862 )
						if( Color_con2 <= 0.011104 )
							if( upperBand <= 0.699291 )
								if( upperBand <= 0.60849 )
									ret := 0.052939
								if( upperBand > 0.60849 )
									ret := -0.362500
							if( upperBand > 0.699291 )
								if( upperBand <= 0.761308 )
									ret := 0.725490 // buy
								if( upperBand > 0.761308 )
									ret := -0.173913
						if( Color_con2 > 0.011104 )
							if( lowerBand <= -0.008047 )
								if( upperBand <= 0.142703 )
									ret := -0.333333
								if( upperBand > 0.142703 )
									ret := 0.097844
							if( lowerBand > -0.008047 )
								if( Color_con1 <= -0.050632 )
									ret := -0.093458
								if( Color_con1 > -0.050632 )
									ret := 0.255054
					if( Color_con1 > 0.451862 )
						if( upperBand <= 0.626035 )
							if( Color_con2 <= 0.90528 )
								ret := -0.714286 // sell
							if( Color_con2 > 0.90528 )
								ret := 0.600000
						if( upperBand > 0.626035 )
							if( midLine <= 0.392658 )
								if( upperBand <= 0.755498 )
									ret := 0.903226 // buy
								if( upperBand > 0.755498 )
									ret := 0.564516
							if( midLine > 0.392658 )
								ret := -0.600000
				if( midLine > 0.412991 )
					if( midLine <= 0.958396 )
						if( wvf <= 0.682113 )
							if( midLine <= 0.520694 )
								if( wvf <= 0.61486 )
									ret := -0.428571
								if( wvf > 0.61486 )
									ret := -0.731707 // sell
							if( midLine > 0.520694 )
								ret := 0.750000 // buy
						if( wvf > 0.682113 )
							if( upperBand <= 0.817912 )
								if( lowerBand <= 0.024843 )
									ret := -1.000000 // sell
								if( lowerBand > 0.024843 )
									ret := 0.359116
							if( upperBand > 0.817912 )
								if( sDev <= 0.260569 )
									ret := -0.810811 // sell
								if( sDev > 0.260569 )
									ret := -0.047452
					if( midLine > 0.958396 )
						if( wvf <= 2.00678 )
							if( midLine <= 1.00544 )
								if( midLine <= 0.991199 )
									ret := 0.833333 // buy
								if( midLine > 0.991199 )
									ret := 0.000000
							if( midLine > 1.00544 )
								if( sDev <= 0.592463 )
									ret := 0.750000 // buy
								if( sDev > 0.592463 )
									ret := 1.000000 // buy
						if( wvf > 2.00678 )
							if( Color_con2 <= 0.998329 )
								if( Color_con1 <= 0.111165 )
									ret := -0.750000 // sell
								if( Color_con1 > 0.111165 )
									ret := 0.333333
							if( Color_con2 > 0.998329 )
								if( wvf <= 7.77991 )
									ret := 0.631579
								if( wvf > 7.77991 )
									ret := -0.800000 // sell
	if( lowerBand > 0.566203 )
		if( Color_con2 <= -3.39488 )
			if( wvf <= 1.39744 )
				if( lowerBand <= 0.955849 )
					ret := 1.000000 // buy
				if( lowerBand > 0.955849 )
					ret := -1.000000 // sell
			if( wvf > 1.39744 )
				if( midLine <= 5.34129 )
					if( lowerBand <= 1.02104 )
						ret := -0.750000 // sell
					if( lowerBand > 1.02104 )
						ret := -1.000000 // sell
				if( midLine > 5.34129 )
					ret := 0.000000
		if( Color_con2 > -3.39488 )
			if( upperBand <= 4.54107 )
				if( Color_con1 <= -0.822643 )
					if( upperBand <= 1.87565 )
						if( sDev <= 0.596351 )
							if( Color_con1 <= -0.832539 )
								if( Color_con2 <= -0.522479 )
									ret := -0.171053
								if( Color_con2 > -0.522479 )
									ret := 0.240000
							if( Color_con1 > -0.832539 )
								ret := -1.000000 // sell
						if( sDev > 0.596351 )
							if( Color_con1 <= -1.16881 )
								if( Color_con1 <= -1.23277 )
									ret := -0.500000
								if( Color_con1 > -1.23277 )
									ret := 0.250000
							if( Color_con1 > -1.16881 )
								if( wvf <= 0.952803 )
									ret := -0.944444 // sell
								if( wvf > 0.952803 )
									ret := 0.000000
					if( upperBand > 1.87565 )
						if( wvf <= 1.89064 )
							if( upperBand <= 2.02723 )
								if( lowerBand <= 1.01225 )
									ret := 0.689189
								if( lowerBand > 1.01225 )
									ret := -0.769231 // sell
							if( upperBand > 2.02723 )
								if( wvf <= 1.67898 )
									ret := 0.077806
								if( wvf > 1.67898 )
									ret := 0.652174
						if( wvf > 1.89064 )
							if( midLine <= 2.49915 )
								if( Color_con2 <= -0.11194 )
									ret := -0.639175
								if( Color_con2 > -0.11194 )
									ret := 0.208333
							if( midLine > 2.49915 )
								if( Color_con2 <= -0.420847 )
									ret := 0.253731
								if( Color_con2 > -0.420847 )
									ret := -0.565217
				if( Color_con1 > -0.822643 )
					if( midLine <= 1.82536 )
						if( Color_con2 <= -0.332024 )
							if( Color_con1 <= -0.167519 )
								if( sDev <= 0.546237 )
									ret := 0.471831
								if( sDev > 0.546237 )
									ret := -0.085714
							if( Color_con1 > -0.167519 )
								if( Color_con2 <= -0.572396 )
									ret := -1.000000 // sell
								if( Color_con2 > -0.572396 )
									ret := -0.500000
						if( Color_con2 > -0.332024 )
							if( wvf <= 2.33804 )
								if( Color_con2 <= 0.334488 )
									ret := 0.135841
								if( Color_con2 > 0.334488 )
									ret := 0.775862 // buy
							if( wvf > 2.33804 )
								if( wvf <= 2.61771 )
									ret := -0.800000 // sell
								if( wvf > 2.61771 )
									ret := 0.750000 // buy
					if( midLine > 1.82536 )
						if( midLine <= 2.41159 )
							if( upperBand <= 2.47904 )
								ret := -0.333333
							if( upperBand > 2.47904 )
								if( lowerBand <= 0.695603 )
									ret := 0.000000
								if( lowerBand > 0.695603 )
									ret := 0.717742 // buy
						if( midLine > 2.41159 )
							if( wvf <= 2.61123 )
								ret := 0.833333 // buy
							if( wvf > 2.61123 )
								if( upperBand <= 3.92175 )
									ret := -0.733333 // sell
								if( upperBand > 3.92175 )
									ret := 0.400000
			if( upperBand > 4.54107 )
				if( midLine <= 4.10718 )
					if( lowerBand <= 0.690849 )
						if( upperBand <= 5.99095 )
							ret := 1.000000 // buy
						if( upperBand > 5.99095 )
							ret := -0.857143 // sell
					if( lowerBand > 0.690849 )
						if( midLine <= 3.05952 )
							ret := 0.333333
						if( midLine > 3.05952 )
							if( sDev <= 1.47379 )
								ret := 0.500000
							if( sDev > 1.47379 )
								if( midLine <= 3.29163 )
									ret := 0.862069 // buy
								if( midLine > 3.29163 )
									ret := 1.000000 // buy
				if( midLine > 4.10718 )
					if( Color_con2 <= -0.075648 )
						if( upperBand <= 13.6609 )
							if( Color_con1 <= -2.81198 )
								ret := -1.000000 // sell
							if( Color_con1 > -2.81198 )
								ret := -0.600000
						if( upperBand > 13.6609 )
							ret := 0.250000
					if( Color_con2 > -0.075648 )
						if( sDev <= 4.90197 )
							ret := 0.250000
						if( sDev > 4.90197 )
							if( upperBand <= 14.6868 )
								ret := 1.000000 // buy
							if( upperBand > 14.6868 )
								ret := 0.750000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_AMZN_5Min_fac73a5c(rangeHigh, rangeLow, midLine, sDev, lowerBand, wvf, Color_con1, colInt, Color_con2, upperBand)

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


