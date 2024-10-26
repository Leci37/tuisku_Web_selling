//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Madrid_Moving_Average_Ribbon
// ID_model: TSLA_30Min_1MAD_a5b2092a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TSLA_30Min_1MAD_a5b2092a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TSLA_30Min_a5b2092a(ma100, ma55_colorInt, ma60_colorInt, ma80, ma25, ma75_colorInt, ma80_colorInt, ma50_colorInt, ma30, ma40_colorInt, ma90, ma45_colorInt, ma40, ma50, ma10_colorInt, ma15_colorInt, ma85_colorInt, ma05_colorInt, ma20, ma70, ma70_colorInt, ma85, ma30_colorInt, ma60, ma45, ma55, ma65, ma90_colorInt, ma35, ma20_colorInt, ma65_colorInt, ma10, ma25_colorInt, ma75, ma15, ma05, ma35_colorInt)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ma90 <= 119.211 )
		if( ma70 <= 114.406 )
			if( ma90 <= 111.245 )
				if( ma80 <= 110.087 )
					if( ma05 <= 104.516 )
						ret := 1.000000 // buy
					if( ma05 > 104.516 )
						ret := 0.833333 // buy
				if( ma80 > 110.087 )
					if( ma30 <= 109.271 )
						ret := 0.300000
					if( ma30 > 109.271 )
						ret := 0.909091 // buy
			if( ma90 > 111.245 )
				if( ma35 <= 112.563 )
					if( ma75 <= 112.373 )
						if( ma15 <= 110.46 )
							ret := -1.000000 // sell
						if( ma15 > 110.46 )
							ret := 0.600000
					if( ma75 > 112.373 )
						if( ma20 <= 111.991 )
							if( ma100 <= 114.604 )
								ret := 1.000000 // buy
							if( ma100 > 114.604 )
								ret := 0.800000 // buy
						if( ma20 > 111.991 )
							ret := 0.125000
				if( ma35 > 112.563 )
					if( ma10_colorInt <= 2 )
						ret := -0.333333
					if( ma10_colorInt > 2 )
						ret := -1.000000 // sell
		if( ma70 > 114.406 )
			if( ma30 <= 119.28 )
				if( ma40 <= 114.951 )
					if( ma60_colorInt <= 3.5 )
						if( ma50 <= 113.851 )
							if( ma50_colorInt <= 3.5 )
								if( ma10 <= 111.332 )
									ret := 1.000000 // buy
								if( ma10 > 111.332 )
									ret := 0.916667 // buy
							if( ma50_colorInt > 3.5 )
								ret := 0.500000
						if( ma50 > 113.851 )
							ret := 0.384615
					if( ma60_colorInt > 3.5 )
						ret := 1.000000 // buy
				if( ma40 > 114.951 )
					if( ma25 <= 118.081 )
						ret := -0.411765
					if( ma25 > 118.081 )
						if( ma90 <= 117.065 )
							if( ma35 <= 118.304 )
								ret := 0.083333
							if( ma35 > 118.304 )
								if( ma100 <= 116.168 )
									ret := 0.923077 // buy
								if( ma100 > 116.168 )
									ret := 0.500000
						if( ma90 > 117.065 )
							if( ma10 <= 119.883 )
								ret := 1.000000 // buy
							if( ma10 > 119.883 )
								ret := 0.928571 // buy
			if( ma30 > 119.28 )
				if( ma45 <= 118.604 )
					if( ma50 <= 118.007 )
						ret := -0.692308
					if( ma50 > 118.007 )
						ret := -1.000000 // sell
				if( ma45 > 118.604 )
					if( ma35 <= 120.312 )
						if( ma90_colorInt <= 3.5 )
							ret := 1.000000 // buy
						if( ma90_colorInt > 3.5 )
							ret := 0.500000
					if( ma35 > 120.312 )
						ret := 0.222222
	if( ma90 > 119.211 )
		if( ma15_colorInt <= 2.5 )
			if( ma85 <= 2161.57 )
				if( ma45 <= 169.546 )
					if( ma20 <= 170.224 )
						if( ma60 <= 141.427 )
							if( ma60 <= 120.317 )
								if( ma75 <= 119.942 )
									ret := -0.769231 // sell
								if( ma75 > 119.942 )
									ret := -1.000000 // sell
							if( ma60 > 120.317 )
								if( ma20 <= 142.683 )
									ret := 0.204489
								if( ma20 > 142.683 )
									ret := -0.711111 // sell
						if( ma60 > 141.427 )
							if( ma60 <= 146.902 )
								if( ma15 <= 143.629 )
									ret := 0.625000
								if( ma15 > 143.629 )
									ret := 0.962264 // buy
							if( ma60 > 146.902 )
								if( ma85 <= 161.707 )
									ret := 0.360169
								if( ma85 > 161.707 )
									ret := 0.664557
					if( ma20 > 170.224 )
						if( ma35 <= 169.6 )
							if( ma20 <= 170.97 )
								if( ma10_colorInt <= 1.5 )
									ret := -0.984375 // sell
								if( ma10_colorInt > 1.5 )
									ret := -0.812500 // sell
							if( ma20 > 170.97 )
								ret := -0.500000
						if( ma35 > 169.6 )
							if( ma05 <= 172.882 )
								ret := 0.400000
							if( ma05 > 172.882 )
								if( ma90 <= 165.911 )
									ret := 0.900000 // buy
								if( ma90 > 165.911 )
									ret := 0.666667
				if( ma45 > 169.546 )
					if( ma90 <= 165.923 )
						if( ma85 <= 165.944 )
							ret := -1.000000 // sell
						if( ma85 > 165.944 )
							if( ma25 <= 169.911 )
								ret := -1.000000 // sell
							if( ma25 > 169.911 )
								ret := -0.750000 // sell
					if( ma90 > 165.923 )
						if( ma40 <= 444.137 )
							if( ma25 <= 432.939 )
								if( ma40 <= 384.174 )
									ret := -0.000171
								if( ma40 > 384.174 )
									ret := 0.179433
							if( ma25 > 432.939 )
								if( ma75 <= 427.716 )
									ret := -0.669565
								if( ma75 > 427.716 )
									ret := -0.165939
						if( ma40 > 444.137 )
							if( ma50 <= 656.247 )
								if( ma70_colorInt <= 2.5 )
									ret := 0.139769
								if( ma70_colorInt > 2.5 )
									ret := 0.575058
							if( ma50 > 656.247 )
								if( ma70 <= 658.334 )
									ret := -0.359862
								if( ma70 > 658.334 )
									ret := 0.032610
			if( ma85 > 2161.57 )
				if( ma80 <= 2184.15 )
					ret := -0.818182 // sell
				if( ma80 > 2184.15 )
					if( ma35 <= 2247.53 )
						ret := -1.000000 // sell
					if( ma35 > 2247.53 )
						ret := -0.950000 // sell
		if( ma15_colorInt > 2.5 )
			if( ma65 <= 1443.58 )
				if( ma70 <= 883.305 )
					if( ma15 <= 859.651 )
						if( ma90_colorInt <= 2.5 )
							if( ma45 <= 169.617 )
								if( ma100 <= 127.07 )
									ret := 0.904762 // buy
								if( ma100 > 127.07 )
									ret := 0.622222
							if( ma45 > 169.617 )
								if( ma80 <= 225.579 )
									ret := 0.127700
								if( ma80 > 225.579 )
									ret := -0.014311
						if( ma90_colorInt > 2.5 )
							if( ma20 <= 128.063 )
								if( ma25 <= 112.884 )
									ret := 0.571429
								if( ma25 > 112.884 )
									ret := -0.838028 // sell
							if( ma20 > 128.063 )
								if( ma90 <= 804.271 )
									ret := -0.030042
								if( ma90 > 804.271 )
									ret := -0.177794
					if( ma15 > 859.651 )
						if( ma75 <= 871.048 )
							if( ma90 <= 871.77 )
								ret := 1.000000 // buy
							if( ma90 > 871.77 )
								if( ma90 <= 873.098 )
									ret := 0.733333 // buy
								if( ma90 > 873.098 )
									ret := 0.941176 // buy
						if( ma75 > 871.048 )
							if( ma55 <= 876.887 )
								if( ma60 <= 874.581 )
									ret := 0.139535
								if( ma60 > 874.581 )
									ret := -0.588235
							if( ma55 > 876.887 )
								if( ma20 <= 870.772 )
									ret := 0.035714
								if( ma20 > 870.772 )
									ret := 0.727273 // buy
				if( ma70 > 883.305 )
					if( ma85 <= 896.935 )
						if( ma10 <= 859.146 )
							if( ma25 <= 862.714 )
								ret := -0.076923
							if( ma25 > 862.714 )
								ret := 1.000000 // buy
						if( ma10 > 859.146 )
							if( ma65 <= 893.148 )
								if( ma05 <= 861.002 )
									ret := -0.043478
								if( ma05 > 861.002 )
									ret := -0.712963 // sell
							if( ma65 > 893.148 )
								if( ma75 <= 895.075 )
									ret := -1.000000 // sell
								if( ma75 > 895.075 )
									ret := -0.894737 // sell
					if( ma85 > 896.935 )
						if( ma55 <= 1424.98 )
							if( ma70 <= 1201.82 )
								if( ma100 <= 1132.78 )
									ret := -0.090734
								if( ma100 > 1132.78 )
									ret := -0.602210
							if( ma70 > 1201.82 )
								if( ma90 <= 1427.16 )
									ret := 0.974359 // buy
								if( ma90 > 1427.16 )
									ret := 0.875000 // buy
						if( ma55 > 1424.98 )
							if( ma80 <= 1438.14 )
								ret := -1.000000 // sell
							if( ma80 > 1438.14 )
								ret := -0.444444
			if( ma65 > 1443.58 )
				if( ma35 <= 1461.07 )
					if( ma75 <= 1471.14 )
						if( ma15 <= 1427.32 )
							ret := 0.166667
						if( ma15 > 1427.32 )
							ret := 0.142857
					if( ma75 > 1471.14 )
						if( ma35 <= 1445.22 )
							if( ma45_colorInt <= 3.5 )
								if( ma70 <= 1581.89 )
									ret := 1.000000 // buy
								if( ma70 > 1581.89 )
									ret := 0.823529 // buy
							if( ma45_colorInt > 3.5 )
								ret := 0.647059
						if( ma35 > 1445.22 )
							if( ma80 <= 1480.74 )
								ret := 1.000000 // buy
							if( ma80 > 1480.74 )
								ret := -0.214286
				if( ma35 > 1461.07 )
					if( ma75 <= 1473.35 )
						ret := -1.000000 // sell
					if( ma75 > 1473.35 )
						if( ma70 <= 1532.53 )
							if( ma75_colorInt <= 1.5 )
								if( ma90 <= 1507.99 )
									ret := -0.333333
								if( ma90 > 1507.99 )
									ret := -1.000000 // sell
							if( ma75_colorInt > 1.5 )
								if( ma25 <= 1488.66 )
									ret := 0.128713
								if( ma25 > 1488.66 )
									ret := 0.722581 // buy
						if( ma70 > 1532.53 )
							if( ma45 <= 1589.65 )
								if( ma100 <= 1578.27 )
									ret := -0.500000
								if( ma100 > 1578.27 )
									ret := -1.000000 // sell
							if( ma45 > 1589.65 )
								if( ma85 <= 2002.04 )
									ret := 0.600000
								if( ma85 > 2002.04 )
									ret := -0.388889
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Madrid_Moving_Average_Ribbon 
//@version=5
//indicator "Madrid Moving Average Ribbon", shorttitle="Madrid Ribbon", overlay=true)


PHI     = (1 + math.sqrt(5)) / 2
PI      = 104348 / 33215

BULL    = 1
BEAR    = -1
NONE    = 0

GRN01 = color.rgb(124, 252, 0)
GRN02 = color.rgb(50, 205, 50)
GRN03 = color.rgb(34, 139, 34)
GRN04 = color.rgb(0, 100, 0)
GRN05 = color.rgb(0, 128, 0)
GRN06 = color.rgb(9, 53, 7)
RED01 = color.rgb(255, 69, 0)
RED02 = color.rgb(255, 0, 0)
RED03 = color.rgb(178, 34, 34)
RED04 = color.rgb(139, 0, 0)
RED05 = color.rgb(128, 0, 0)
RED06 = color.rgb(51, 13, 6)

// Define other v3 Style Colors
AQUA    = color.rgb(0, 255, 255)
BLACK   = color.rgb(0, 0, 0)
BLUE    = color.rgb(0, 0, 255)
FUCHSIA = color.rgb(255, 0, 255)
GRAY    = color.rgb(128, 128, 128)
GREEN   = color.rgb(0, 128, 0)
LIME    = color.rgb(0, 255, 0)
MAROON  = color.rgb(128, 0, 0)
NAVY    = color.rgb(0, 0, 128)
OLIVE   = color.rgb(128, 128, 0)
ORANGE  = color.rgb(255, 127, 0)
PURPLE  = color.rgb(128, 0, 128)
RUBI    = color.rgb(255, 0, 0)
SILVER  = color.rgb(192, 192, 192)
TEAL    = color.rgb(0, 128, 128)
YELLOW  = color.rgb(255, 255, 0)
WHITE   = color.rgb(255, 255, 255)


// ──────────[ Moving Average Color ]
maColor(_ma, _maRef) =>
    diffMA = ta.change(_ma)
    diffMA >= 0 and _ma > _maRef ? LIME : diffMA < 0 and _ma > _maRef ? MAROON : diffMA <= 0 and _ma < _maRef ? RUBI : diffMA >= 0 and _ma < _maRef ? GREEN : GRAY

// Function to calculate the integer representing the color condition
ma_color_int(ma, ma_ref) =>
    diff_ma = ta.change(ma)
    diff_ma >= 0 and ma > ma_ref ? 1 : diff_ma < 0 and ma > ma_ref ? 2 : diff_ma <= 0 and ma < ma_ref ? 3 : diff_ma >= 0 and ma < ma_ref ? 4 : 5


_10   = input.bool(false, '───────────[ Madrid Ribbon]───────────' )
i_exp = input(true, title="Exponential MA")

// ────────────────────[ Processing ]
src = close

ma05  = i_exp ? ta.ema(src, 5) : ta.sma(src, 5)
ma10  = i_exp ? ta.ema(src, 10) : ta.sma(src, 10)
ma15  = i_exp ? ta.ema(src, 15) : ta.sma(src, 15)
ma20  = i_exp ? ta.ema(src, 20) : ta.sma(src, 20)
ma25  = i_exp ? ta.ema(src, 25) : ta.sma(src, 25)
ma30  = i_exp ? ta.ema(src, 30) : ta.sma(src, 30)
ma35  = i_exp ? ta.ema(src, 35) : ta.sma(src, 35)
ma40  = i_exp ? ta.ema(src, 40) : ta.sma(src, 40)
ma45  = i_exp ? ta.ema(src, 45) : ta.sma(src, 45)
ma50  = i_exp ? ta.ema(src, 50) : ta.sma(src, 50)
ma55  = i_exp ? ta.ema(src, 55) : ta.sma(src, 55)
ma60  = i_exp ? ta.ema(src, 60) : ta.sma(src, 60)
ma65  = i_exp ? ta.ema(src, 65) : ta.sma(src, 65)
ma70  = i_exp ? ta.ema(src, 70) : ta.sma(src, 70)
ma75  = i_exp ? ta.ema(src, 75) : ta.sma(src, 75)
ma80  = i_exp ? ta.ema(src, 80) : ta.sma(src, 80)
ma85  = i_exp ? ta.ema(src, 85) : ta.sma(src, 85)
ma90  = i_exp ? ta.ema(src, 90) : ta.sma(src, 90)
ma100 = i_exp ? ta.ema(src, 100) : ta.sma(src, 100)

// ────────────────────[ Plot ]
plot(ma05, color=maColor(ma05, ma100), title="MMA05", linewidth=3)
plot(ma10, color=maColor(ma10, ma100), title="MMA10", linewidth=1)
plot(ma15, color=maColor(ma15, ma100), title="MMA15", linewidth=1)
plot(ma20, color=maColor(ma20, ma100), title="MMA20", linewidth=1)
plot(ma25, color=maColor(ma25, ma100), title="MMA25", linewidth=1)
plot(ma30, color=maColor(ma30, ma100), title="MMA30", linewidth=1)
plot(ma35, color=maColor(ma35, ma100), title="MMA35", linewidth=1)
plot(ma40, color=maColor(ma40, ma100), title="MMA40", linewidth=1)
plot(ma45, color=maColor(ma45, ma100), title="MMA45", linewidth=1)
plot(ma50, color=maColor(ma50, ma100), title="MMA50", linewidth=1)
plot(ma55, color=maColor(ma55, ma100), title="MMA55", linewidth=1)
plot(ma60, color=maColor(ma60, ma100), title="MMA60", linewidth=1)
plot(ma65, color=maColor(ma65, ma100), title="MMA65", linewidth=1)
plot(ma70, color=maColor(ma70, ma100), title="MMA70", linewidth=1)
plot(ma75, color=maColor(ma75, ma100), title="MMA75", linewidth=1)
plot(ma80, color=maColor(ma80, ma100), title="MMA80", linewidth=1)
plot(ma85, color=maColor(ma85, ma100), title="MMA85", linewidth=1)
plot(ma90, color=maColor(ma90, ma100), title="MMA90", linewidth=3)



//Calculate colors based on the moving averages compared to ma100
ma05_colorInt = ma_color_int(ma05, ma100)
ma10_colorInt = ma_color_int(ma10, ma100)
ma15_colorInt = ma_color_int(ma15, ma100)
ma20_colorInt = ma_color_int(ma20, ma100)
ma25_colorInt = ma_color_int(ma25, ma100)
ma30_colorInt = ma_color_int(ma30, ma100)
ma35_colorInt = ma_color_int(ma35, ma100)
ma40_colorInt = ma_color_int(ma40, ma100)
ma45_colorInt = ma_color_int(ma45, ma100)
ma50_colorInt = ma_color_int(ma50, ma100)
ma55_colorInt = ma_color_int(ma55, ma100)
ma60_colorInt = ma_color_int(ma60, ma100)
ma65_colorInt = ma_color_int(ma65, ma100)
ma70_colorInt = ma_color_int(ma70, ma100)
ma75_colorInt = ma_color_int(ma75, ma100)
ma80_colorInt = ma_color_int(ma80, ma100)
ma85_colorInt = ma_color_int(ma85, ma100)
ma90_colorInt = ma_color_int(ma90, ma100)


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
float op_operation = decision_tree_0_TSLA_30Min_a5b2092a(ma100, ma55_colorInt, ma60_colorInt, ma80, ma25, ma75_colorInt, ma80_colorInt, ma50_colorInt, ma30, ma40_colorInt, ma90, ma45_colorInt, ma40, ma50, ma10_colorInt, ma15_colorInt, ma85_colorInt, ma05_colorInt, ma20, ma70, ma70_colorInt, ma85, ma30_colorInt, ma60, ma45, ma55, ma65, ma90_colorInt, ma35, ma20_colorInt, ma65_colorInt, ma10, ma25_colorInt, ma75, ma15, ma05, ma35_colorInt)

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


