//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: UBER_1Hour_2CS0_38168645 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UBER_1Hour_2CS0_38168645", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UBER_1Hour_38168645(ad_mf, mf, ad, rsi1, d, k, smoothD_d, d_k, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( mf <= 0.002287 )
		if( ad <= -35739.3 )
			if( ad <= -124461 )
				if( d_k <= -8.17066 )
					if( ad <= -2.94247e+06 )
						if( smoothK_k <= 72.4243 )
							ret := -0.694444
						if( smoothK_k > 72.4243 )
							ret := -0.078947
					if( ad > -2.94247e+06 )
						if( d <= 67.7133 )
							ret := -0.171053
						if( d > 67.7133 )
							ret := 0.216000
				if( d_k > -8.17066 )
					if( rsi1 <= 27.6956 )
						if( ad <= -692714 )
							ret := 0.053712
						if( ad > -692714 )
							ret := 0.505747
					if( rsi1 > 27.6956 )
						if( ad_mf <= -1.63481e+06 )
							ret := 0.059037
						if( ad_mf > -1.63481e+06 )
							ret := -0.076873
			if( ad > -124461 )
				if( d <= 88.7126 )
					if( rsi1 <= 37.3526 )
						if( ad_mf <= -68595.7 )
							ret := 0.808333 // buy
						if( ad_mf > -68595.7 )
							ret := 0.331169
					if( rsi1 > 37.3526 )
						if( ad_mf <= -73292.1 )
							ret := -0.235294
						if( ad_mf > -73292.1 )
							ret := 0.475000
				if( d > 88.7126 )
					if( mf <= -0.056962 )
						if( ad <= -46120.7 )
							ret := 0.000000
						if( ad > -46120.7 )
							ret := -1.000000 // sell
					if( mf > -0.056962 )
						ret := -0.111111
		if( ad > -35739.3 )
			if( d <= 72.9572 )
				if( ad <= -26117.1 )
					if( d <= 6.29099 )
						ret := 0.000000
					if( d > 6.29099 )
						if( k <= 44.7093 )
							ret := -0.875000 // sell
						if( k > 44.7093 )
							ret := -0.476190
				if( ad > -26117.1 )
					if( ad_mf <= 0.238754 )
						if( smoothD_d <= 3.70849 )
							ret := -0.232510
						if( smoothD_d > 3.70849 )
							ret := -0.014453
					if( ad_mf > 0.238754 )
						if( ad <= 34273.2 )
							ret := -0.265860
						if( ad > 34273.2 )
							ret := -0.074142
			if( d > 72.9572 )
				if( ad_mf <= 440785 )
					if( rsi1 <= 70.9511 )
						if( ad_mf <= 370819 )
							ret := -0.070617
						if( ad_mf > 370819 )
							ret := -0.619048
					if( rsi1 > 70.9511 )
						if( mf <= -0.24404 )
							ret := -0.666667
						if( mf > -0.24404 )
							ret := 0.277027
				if( ad_mf > 440785 )
					if( ad_mf <= 3.31795e+06 )
						if( d_k <= -15.967 )
							ret := -0.617647
						if( d_k > -15.967 )
							ret := 0.281716
					if( ad_mf > 3.31795e+06 )
						if( d_k <= 1.61903 )
							ret := -0.686567
						if( d_k > 1.61903 )
							ret := 0.764706 // buy
	if( mf > 0.002287 )
		if( ad_mf <= 2252.92 )
			if( d_k <= -1.9829 )
				if( ad_mf <= -2.87701e+06 )
					if( ad <= -5.99465e+06 )
						ret := 0.833333 // buy
					if( ad > -5.99465e+06 )
						if( ad_mf <= -4.6173e+06 )
							ret := -1.000000 // sell
						if( ad_mf > -4.6173e+06 )
							ret := -0.190476
				if( ad_mf > -2.87701e+06 )
					if( ad <= -2.00682e+06 )
						if( smoothD_d <= 89.6411 )
							ret := 0.684783
						if( smoothD_d > 89.6411 )
							ret := -1.000000 // sell
					if( ad > -2.00682e+06 )
						if( rsi1 <= 35.5417 )
							ret := 0.469512
						if( rsi1 > 35.5417 )
							ret := 0.156317
			if( d_k > -1.9829 )
				if( ad <= 1225.4 )
					if( ad_mf <= 301.218 )
						if( ad <= -297543 )
							ret := 0.000570
						if( ad > -297543 )
							ret := 0.122323
					if( ad_mf > 301.218 )
						if( k <= 82.9509 )
							ret := -0.308824
						if( k > 82.9509 )
							ret := 0.226667
				if( ad > 1225.4 )
					if( k <= 20.2975 )
						if( ad <= 2140.71 )
							ret := -0.333333
						if( ad > 2140.71 )
							ret := 0.600000
					if( k > 20.2975 )
						if( smoothK_k <= 64.0208 )
							ret := 0.580952
						if( smoothK_k > 64.0208 )
							ret := 0.237569
		if( ad_mf > 2252.92 )
			if( rsi1 <= 57.1558 )
				if( d <= 73.1496 )
					if( mf <= 0.00538 )
						if( d <= 67.0042 )
							ret := 0.607843
						if( d > 67.0042 )
							ret := -0.750000 // sell
					if( mf > 0.00538 )
						if( d_k <= 19.441 )
							ret := -0.127085
						if( d_k > 19.441 )
							ret := 0.195652
				if( d > 73.1496 )
					if( ad_mf <= 1.61434e+06 )
						if( smoothD_d <= 71.616 )
							ret := -0.388889
						if( smoothD_d > 71.616 )
							ret := 0.214559
					if( ad_mf > 1.61434e+06 )
						if( ad_mf <= 2.26155e+06 )
							ret := -0.925926 // sell
						if( ad_mf > 2.26155e+06 )
							ret := 0.127273
			if( rsi1 > 57.1558 )
				if( ad <= 3194.01 )
					if( rsi1 <= 64.8944 )
						if( ad_mf <= 2330.35 )
							ret := -0.875000 // sell
						if( ad_mf > 2330.35 )
							ret := 0.178571
					if( rsi1 > 64.8944 )
						if( smoothD_d <= 23.4554 )
							ret := 0.375000
						if( smoothD_d > 23.4554 )
							ret := -0.554688
				if( ad > 3194.01 )
					if( ad <= 9.26584e+06 )
						if( ad <= 7.96769e+06 )
							ret := 0.063577
						if( ad > 7.96769e+06 )
							ret := 0.869565 // buy
					if( ad > 9.26584e+06 )
						if( ad_mf <= 1.25882e+07 )
							ret := -0.921569 // sell
						if( ad_mf > 1.25882e+07 )
							ret := 0.272727
	
    ret //return
// Define expected timeframe based on the selected interval: 1Hour pine_value: 60   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1HOUR !!"
if (str.tostring(timeframe.period) != "60")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf

//CODE associated with the technical indicator L_Stochastic_RSI 
//@version=5
//indicator title="Stochastic RSI", shorttitle="Stoch RSI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
smoothK = input.int(3, "K", minval=1)
smoothD = input.int(3, "D", minval=1)
lengthRSI = input.int(14, "RSI Length", minval=1)
lengthStoch = input.int(14, "Stochastic Length", minval=1)
src = input(close, title="RSI Source")
rsi1 = ta.rsi(src, lengthRSI)
k = ta.sma(ta.stoch(rsi1, rsi1, rsi1, lengthStoch), smoothK)
d = ta.sma(k, smoothD)
plot(k, "K", color=#2962FF)
plot(d, "D", color=#FF6D00)

d_k = d - k
smoothD_d = d - smoothD
smoothK_k = k - smoothK

h0 = hline(80, "Upper Band", color=#787B86)
hline(50, "Middle Band", color=color.new(#787B86, 50))
h1 = hline(20, "Lower Band", color=#787B86)
fill(h0, h1, color=color.rgb(33, 150, 243, 90), title="Background")
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
float op_operation = decision_tree_0_UBER_1Hour_38168645(ad_mf, mf, ad, rsi1, d, k, smoothD_d, d_k, smoothK_k)

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


