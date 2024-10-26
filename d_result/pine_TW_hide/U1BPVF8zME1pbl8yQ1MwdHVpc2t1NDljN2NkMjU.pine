//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: SPOT_30Min_2CS0_49c7cd25 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SPOT_30Min_2CS0_49c7cd25", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SPOT_30Min_49c7cd25(mf, ad, ad_mf, d_k, d, rsi1, k, smoothD_d, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( ad_mf <= 0.333228 )
		if( rsi1 <= 61.743 )
			if( mf <= 0.242587 )
				if( d_k <= -24.8393 )
					if( rsi1 <= 55.4697 )
						if( d <= 44.2091 )
							ret := 0.423529
						if( d > 44.2091 )
							ret := -0.420000
					if( rsi1 > 55.4697 )
						if( d_k <= -25.7094 )
							ret := -0.705128 // sell
						if( d_k > -25.7094 )
							ret := 0.125000
				if( d_k > -24.8393 )
					if( d <= 6.55683 )
						if( ad_mf <= -3413.35 )
							ret := 0.067457
						if( ad_mf > -3413.35 )
							ret := -0.196386
					if( d > 6.55683 )
						if( d <= 11.8061 )
							ret := 0.168389
						if( d > 11.8061 )
							ret := 0.044686
			if( mf > 0.242587 )
				if( ad_mf <= -0.312214 )
					if( smoothD_d <= 57.4305 )
						if( rsi1 <= 29.6499 )
							ret := 0.674419
						if( rsi1 > 29.6499 )
							ret := 0.161235
					if( smoothD_d > 57.4305 )
						if( d <= 84.3456 )
							ret := 0.628440
						if( d > 84.3456 )
							ret := 0.189873
				if( ad_mf > -0.312214 )
					if( d_k <= 16.6721 )
						if( rsi1 <= 44.6854 )
							ret := 0.447368
						if( rsi1 > 44.6854 )
							ret := -0.294118
					if( d_k > 16.6721 )
						if( smoothK_k <= 23.3854 )
							ret := 0.958333 // buy
						if( smoothK_k > 23.3854 )
							ret := 0.035714
		if( rsi1 > 61.743 )
			if( k <= 85.6938 )
				if( k <= 72.6042 )
					if( mf <= 0.368314 )
						if( rsi1 <= 72.5264 )
							ret := -0.025449
						if( rsi1 > 72.5264 )
							ret := -0.261290
					if( mf > 0.368314 )
						if( smoothD_d <= 52.5176 )
							ret := 0.421053
						if( smoothD_d > 52.5176 )
							ret := -0.046512
				if( k > 72.6042 )
					if( smoothD_d <= 85.2588 )
						if( ad_mf <= -6200.64 )
							ret := -0.114943
						if( ad_mf > -6200.64 )
							ret := -0.450292
					if( smoothD_d > 85.2588 )
						if( d_k <= 11.5734 )
							ret := 0.184080
						if( d_k > 11.5734 )
							ret := -0.681818
			if( k > 85.6938 )
				if( rsi1 <= 84.2325 )
					if( smoothK_k <= 94.8979 )
						if( rsi1 <= 62.1617 )
							ret := -0.447368
						if( rsi1 > 62.1617 )
							ret := 0.051399
					if( smoothK_k > 94.8979 )
						if( ad <= -521.028 )
							ret := 0.007843
						if( ad > -521.028 )
							ret := -0.285714
				if( rsi1 > 84.2325 )
					if( ad_mf <= -0.323143 )
						if( ad <= -157631 )
							ret := 0.476190
						if( ad > -157631 )
							ret := -0.193333
					if( ad_mf > -0.323143 )
						if( rsi1 <= 89.7005 )
							ret := 0.745283 // buy
						if( rsi1 > 89.7005 )
							ret := 0.166667
	if( ad_mf > 0.333228 )
		if( mf <= -0.006565 )
			if( k <= 28.9643 )
				if( ad <= 221411 )
					if( rsi1 <= 57.9179 )
						if( ad_mf <= 0.392472 )
							ret := -0.473684
						if( ad_mf > 0.392472 )
							ret := 0.015814
					if( rsi1 > 57.9179 )
						if( d_k <= 1.3299 )
							ret := -0.595238
						if( d_k > 1.3299 )
							ret := 0.000000
				if( ad > 221411 )
					if( d <= 16.679 )
						if( ad_mf <= 336455 )
							ret := -0.270270
						if( ad_mf > 336455 )
							ret := 0.320000
					if( d > 16.679 )
						if( d <= 22.4821 )
							ret := -0.565217
						if( d > 22.4821 )
							ret := -0.923077 // sell
			if( k > 28.9643 )
				if( d <= 62.4553 )
					if( ad_mf <= 6256.51 )
						if( ad_mf <= 2175.88 )
							ret := -0.256959
						if( ad_mf > 2175.88 )
							ret := -0.518987
					if( ad_mf > 6256.51 )
						if( ad <= 10086.2 )
							ret := 0.294118
						if( ad > 10086.2 )
							ret := -0.217084
				if( d > 62.4553 )
					if( ad <= 71212.9 )
						if( d_k <= -2.35885 )
							ret := -0.105856
						if( d_k > -2.35885 )
							ret := 0.057851
					if( ad > 71212.9 )
						if( ad_mf <= 113151 )
							ret := -0.506224
						if( ad_mf > 113151 )
							ret := -0.063725
		if( mf > -0.006565 )
			if( rsi1 <= 37.2815 )
				if( smoothK_k <= 27.7164 )
					if( ad_mf <= 72599 )
						if( mf <= 0.057015 )
							ret := -0.153061
						if( mf > 0.057015 )
							ret := 0.110831
					if( ad_mf > 72599 )
						if( smoothD_d <= 12.6011 )
							ret := 0.150442
						if( smoothD_d > 12.6011 )
							ret := 0.521739
				if( smoothK_k > 27.7164 )
					if( k <= 37.7665 )
						if( rsi1 <= 28.7768 )
							ret := 0.545455
						if( rsi1 > 28.7768 )
							ret := 0.868421 // buy
					if( k > 37.7665 )
						if( d <= 69.6961 )
							ret := 0.350649
						if( d > 69.6961 )
							ret := -0.363636
			if( rsi1 > 37.2815 )
				if( d <= 22.4513 )
					if( mf <= 0.61008 )
						if( smoothK_k <= 26.5558 )
							ret := -0.111265
						if( smoothK_k > 26.5558 )
							ret := -0.526316
					if( mf > 0.61008 )
						if( rsi1 <= 68.0159 )
							ret := 0.307692
						if( rsi1 > 68.0159 )
							ret := 1.000000 // buy
				if( d > 22.4513 )
					if( ad <= 124396 )
						if( smoothD_d <= 62.5679 )
							ret := 0.081586
						if( smoothD_d > 62.5679 )
							ret := -0.026838
					if( ad > 124396 )
						if( ad_mf <= 260576 )
							ret := -0.232029
						if( ad_mf > 260576 )
							ret := 0.119850
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_SPOT_30Min_49c7cd25(mf, ad, ad_mf, d_k, d, rsi1, k, smoothD_d, smoothK_k)

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


