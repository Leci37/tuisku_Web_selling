//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Triple_EMA
// ID_model: ZI_15Min_2CT0_1fb3bbe0 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ZI_15Min_2CT0_1fb3bbe0", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ZI_15Min_1fb3bbe0(ad, ad_mf, mf, ema2, tema, ema12, ema3, ema1, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( ema12 <= 0.049948 )
		if( ad <= 0.023806 )
			if( ad <= -5062.53 )
				if( ema12 <= -0.520555 )
					if( ad <= -6473.6 )
						if( ema3 <= 28.7805 )
							ret := 0.724138 // buy
						if( ema3 > 28.7805 )
							ret := 0.212485
					if( ad > -6473.6 )
						if( mf <= 0.045937 )
							ret := -0.750000 // sell
						if( mf > 0.045937 )
							ret := -1.000000 // sell
				if( ema12 > -0.520555 )
					if( ad <= -112448 )
						if( ad <= -124424 )
							ret := 0.030280
						if( ad > -124424 )
							ret := 0.326761
					if( ad > -112448 )
						if( ema13 <= 0.032049 )
							ret := -0.065557
						if( ema13 > 0.032049 )
							ret := 0.098901
			if( ad > -5062.53 )
				if( ema12 <= -0.004014 )
					if( ad_mf <= 0.270081 )
						if( ema12 <= -0.364897 )
							ret := 0.406186
						if( ema12 > -0.364897 )
							ret := 0.175888
					if( ad_mf > 0.270081 )
						if( tema <= 9.56001 )
							ret := 0.920000 // buy
						if( tema > 9.56001 )
							ret := -0.128954
				if( ema12 > -0.004014 )
					if( ema2 <= 22.4577 )
						if( ema2 <= 9.09064 )
							ret := 0.666667
						if( ema2 > 9.09064 )
							ret := -0.133607
					if( ema2 > 22.4577 )
						if( ema13 <= 0.005559 )
							ret := -0.146417
						if( ema13 > 0.005559 )
							ret := 0.204188
		if( ad > 0.023806 )
			if( ema12 <= -0.045914 )
				if( ad <= 517990 )
					if( mf <= 0.199224 )
						if( ad_mf <= 1012.56 )
							ret := -0.359375
						if( ad_mf > 1012.56 )
							ret := -0.034953
					if( mf > 0.199224 )
						if( ad_mf <= 50751.7 )
							ret := -0.029777
						if( ad_mf > 50751.7 )
							ret := -0.545752
				if( ad > 517990 )
					if( ema1 <= 13.9827 )
						if( ad_mf <= 729896 )
							ret := -0.866667 // sell
						if( ad_mf > 729896 )
							ret := -0.500000
					if( ema1 > 13.9827 )
						if( ad_mf <= 762303 )
							ret := 0.816092 // buy
						if( ad_mf > 762303 )
							ret := 0.080460
			if( ema12 > -0.045914 )
				if( ema3 <= 9.65501 )
					if( ad_mf <= 58221.5 )
						if( ema1 <= 8.88018 )
							ret := 0.545455
						if( ema1 > 8.88018 )
							ret := 0.151515
					if( ad_mf > 58221.5 )
						if( ad <= 76193.5 )
							ret := 0.903226 // buy
						if( ad > 76193.5 )
							ret := 0.508772
				if( ema3 > 9.65501 )
					if( ad <= 365.674 )
						if( ema2 <= 16.6054 )
							ret := -0.952381 // sell
						if( ema2 > 16.6054 )
							ret := -0.283582
					if( ad > 365.674 )
						if( ad_mf <= 214230 )
							ret := 0.015481
						if( ad_mf > 214230 )
							ret := 0.201739
	if( ema12 > 0.049948 )
		if( mf <= -0.007888 )
			if( ad_mf <= -90.6138 )
				if( mf <= -0.179798 )
					if( tema <= 26.5412 )
						if( ema1 <= 24.4039 )
							ret := -0.078947
						if( ema1 > 24.4039 )
							ret := 0.500000
					if( tema > 26.5412 )
						if( ad <= -407.906 )
							ret := -0.352941
						if( ad > -407.906 )
							ret := 0.846154 // buy
				if( mf > -0.179798 )
					if( ema12 <= 0.405573 )
						if( ad_mf <= -299811 )
							ret := 0.321429
						if( ad_mf > -299811 )
							ret := -0.038790
					if( ema12 > 0.405573 )
						if( ema13 <= 0.674361 )
							ret := 1.000000 // buy
						if( ema13 > 0.674361 )
							ret := 0.090909
			if( ad_mf > -90.6138 )
				if( ad_mf <= 2915.32 )
					if( ema2 <= 67.7899 )
						if( ema12 <= 0.088509 )
							ret := -0.283582
						if( ema12 > 0.088509 )
							ret := -0.554736
					if( ema2 > 67.7899 )
						if( tema <= 69.4898 )
							ret := 0.600000
						if( tema > 69.4898 )
							ret := -0.192308
				if( ad_mf > 2915.32 )
					if( ad <= 4718.92 )
						if( ema13 <= 0.15097 )
							ret := 0.076923
						if( ema13 > 0.15097 )
							ret := 0.605634
					if( ad > 4718.92 )
						if( ema1 <= 38.5153 )
							ret := 0.007680
						if( ema1 > 38.5153 )
							ret := -0.176471
		if( mf > -0.007888 )
			if( ad_mf <= -78909.2 )
				if( ema12 <= 0.371398 )
					if( ad_mf <= -213439 )
						if( mf <= 0.329031 )
							ret := -0.263158
						if( mf > 0.329031 )
							ret := 0.615385
					if( ad_mf > -213439 )
						if( ema3 <= 40.7056 )
							ret := 0.256757
						if( ema3 > 40.7056 )
							ret := -0.023148
				if( ema12 > 0.371398 )
					if( mf <= 0.121225 )
						if( ema13 <= 1.76301 )
							ret := 0.139344
						if( ema13 > 1.76301 )
							ret := -1.000000 // sell
					if( mf > 0.121225 )
						if( ema12 <= 1.10345 )
							ret := 0.693182
						if( ema12 > 1.10345 )
							ret := 0.142857
			if( ad_mf > -78909.2 )
				if( ad <= 9546.11 )
					if( ad_mf <= -0.290818 )
						if( ema12 <= 0.458248 )
							ret := 0.027410
						if( ema12 > 0.458248 )
							ret := -0.230769
					if( ad_mf > -0.290818 )
						if( ema2 <= 22.7923 )
							ret := -0.452830
						if( ema2 > 22.7923 )
							ret := -0.154112
				if( ad > 9546.11 )
					if( ad <= 914670 )
						if( ema1 <= 53.5927 )
							ret := 0.067499
						if( ema1 > 53.5927 )
							ret := -0.066232
					if( ad > 914670 )
						if( ema1 <= 18.283 )
							ret := -0.076923
						if( ema1 > 18.283 )
							ret := -0.840909 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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

//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


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
float op_operation = decision_tree_0_ZI_15Min_1fb3bbe0(ad, ad_mf, mf, ema2, tema, ema12, ema3, ema1, ema13)

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


