//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: AAPL_1Min_2BS0_29e5a8df Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAPL_1Min_2BS0_29e5a8df", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAPL_1Min_29e5a8df(bullPower, bbp, bearPower, bbm, BBPower_Color, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( bearPower <= -0.088016 )
		if( k <= 30.8012 )
			if( bullPower <= -0.590149 )
				if( d <= 38.0049 )
					if( rsi1 <= 8.33834 )
						if( d <= 0.599008 )
							ret := -0.666667
						if( d > 0.599008 )
							if( bbm <= 0.370856 )
								ret := 0.692308
							if( bbm > 0.370856 )
								ret := 1.000000 // buy
					if( rsi1 > 8.33834 )
						if( smoothK_k <= -2.98639 )
							if( bbm <= 0.692582 )
								if( smoothD_d <= -1.06343 )
									ret := -0.250000
								if( smoothD_d > -1.06343 )
									ret := 0.571429
							if( bbm > 0.692582 )
								ret := -0.904762 // sell
						if( smoothK_k > -2.98639 )
							if( bullPower <= -1.63124 )
								ret := 0.538462
							if( bullPower > -1.63124 )
								if( rsi1 <= 33.971 )
									ret := -0.492021
								if( rsi1 > 33.971 )
									ret := 0.583333
				if( d > 38.0049 )
					ret := 1.000000 // buy
			if( bullPower > -0.590149 )
				if( d_k <= 0.172795 )
					if( bbm <= 0.092371 )
						if( d <= 0.032381 )
							if( rsi1 <= 34.225 )
								if( bullPower <= -0.231403 )
									ret := 0.181818
								if( bullPower > -0.231403 )
									ret := -0.384058
							if( rsi1 > 34.225 )
								if( bullPower <= -0.140873 )
									ret := 0.916667 // buy
								if( bullPower > -0.140873 )
									ret := 0.190476
						if( d > 0.032381 )
							if( d <= 6.65113 )
								if( smoothD_d <= 0.528984 )
									ret := 0.223547
								if( smoothD_d > 0.528984 )
									ret := 0.415238
							if( d > 6.65113 )
								if( smoothK_k <= 13.3992 )
									ret := -0.083333
								if( smoothK_k > 13.3992 )
									ret := 0.188889
					if( bbm > 0.092371 )
						if( bullPower <= -0.100435 )
							if( k <= 25.6584 )
								if( d_k <= -6.79915 )
									ret := -0.245714
								if( d_k > -6.79915 )
									ret := 0.058265
							if( k > 25.6584 )
								if( rsi1 <= 30.6834 )
									ret := 0.654450
								if( rsi1 > 30.6834 )
									ret := 0.232323
						if( bullPower > -0.100435 )
							if( bearPower <= -0.805601 )
								if( rsi1 <= 37.7498 )
									ret := 0.808511 // buy
								if( rsi1 > 37.7498 )
									ret := -0.025641
							if( bearPower > -0.805601 )
								if( smoothD_d <= 25.4109 )
									ret := -0.031306
								if( smoothD_d > 25.4109 )
									ret := 0.641026
				if( d_k > 0.172795 )
					if( d_k <= 18.7042 )
						if( rsi1 <= 29.3945 )
							if( bullPower <= 0.04375 )
								if( bbm <= 0.146947 )
									ret := 0.225639
								if( bbm > 0.146947 )
									ret := 0.097183
							if( bullPower > 0.04375 )
								if( bbm <= 1.9632 )
									ret := 0.718750 // buy
								if( bbm > 1.9632 )
									ret := -0.166667
						if( rsi1 > 29.3945 )
							if( k <= 30.0012 )
								if( bullPower <= 0.055395 )
									ret := 0.056962
								if( bullPower > 0.055395 )
									ret := 0.195038
							if( k > 30.0012 )
								if( rsi1 <= 51.2482 )
									ret := 0.325000
								if( rsi1 > 51.2482 )
									ret := 0.970588 // buy
					if( d_k > 18.7042 )
						if( smoothD_d <= 16.9631 )
							if( bbm <= 0.173061 )
								ret := -0.117647
							if( bbm > 0.173061 )
								ret := -0.764706 // sell
						if( smoothD_d > 16.9631 )
							if( d_k <= 21.9341 )
								if( rsi1 <= 29.8048 )
									ret := 0.692913
								if( rsi1 > 29.8048 )
									ret := 0.316693
							if( d_k > 21.9341 )
								if( bbp <= -1.05852 )
									ret := 0.754098 // buy
								if( bbp > -1.05852 )
									ret := 0.136758
		if( k > 30.8012 )
			if( bullPower <= 0.328707 )
				if( k <= 71.529 )
					if( rsi1 <= 33.1253 )
						if( bbm <= 0.291127 )
							if( d_k <= -11.767 )
								if( k <= 69.8653 )
									ret := 0.302000
								if( k > 69.8653 )
									ret := 0.950000 // buy
							if( d_k > -11.767 )
								if( bbm <= 0.278802 )
									ret := 0.087379
								if( bbm > 0.278802 )
									ret := 0.604167
						if( bbm > 0.291127 )
							if( bullPower <= -0.331893 )
								if( d <= 62.6623 )
									ret := -0.730769 // sell
								if( d > 62.6623 )
									ret := 0.161290
							if( bullPower > -0.331893 )
								if( smoothD_d <= 67.4257 )
									ret := -0.066781
								if( smoothD_d > 67.4257 )
									ret := 0.673684
					if( rsi1 > 33.1253 )
						if( bullPower <= -0.368223 )
							if( k <= 57.4946 )
								if( smoothD_d <= 39.2523 )
									ret := 0.333333
								if( smoothD_d > 39.2523 )
									ret := -0.500000
							if( k > 57.4946 )
								if( bbp <= -1.56313 )
									ret := -0.600000
								if( bbp > -1.56313 )
									ret := -1.000000 // sell
						if( bullPower > -0.368223 )
							if( bbm <= 0.067052 )
								if( bbp <= -0.447408 )
									ret := 0.605505
								if( bbp > -0.447408 )
									ret := 0.073702
							if( bbm > 0.067052 )
								if( smoothD_d <= 77.9893 )
									ret := -0.062279
								if( smoothD_d > 77.9893 )
									ret := 0.108696
				if( k > 71.529 )
					if( d_k <= -22.5081 )
						if( smoothD_d <= 59.1061 )
							if( rsi1 <= 36.6774 )
								if( d <= 56.1635 )
									ret := 0.666667
								if( d > 56.1635 )
									ret := 0.980392 // buy
							if( rsi1 > 36.6774 )
								if( bullPower <= 0.216263 )
									ret := 0.520000
								if( bullPower > 0.216263 )
									ret := -0.636364
						if( smoothD_d > 59.1061 )
							if( bearPower <= -0.211814 )
								if( bullPower <= -0.067831 )
									ret := -0.880000 // sell
								if( bullPower > -0.067831 )
									ret := -0.263158
							if( bearPower > -0.211814 )
								if( bearPower <= -0.111722 )
									ret := 0.588235
								if( bearPower > -0.111722 )
									ret := -0.500000
					if( d_k > -22.5081 )
						if( rsi1 <= 31.9586 )
							if( d <= 72.3279 )
								if( smoothK_k <= 75.4199 )
									ret := 0.797980 // buy
								if( smoothK_k > 75.4199 )
									ret := 0.459459
							if( d > 72.3279 )
								if( k <= 89.7671 )
									ret := -0.068182
								if( k > 89.7671 )
									ret := 0.633663
						if( rsi1 > 31.9586 )
							if( smoothK_k <= 92.3954 )
								if( bullPower <= -0.197882 )
									ret := -0.317269
								if( bullPower > -0.197882 )
									ret := 0.033484
							if( smoothK_k > 92.3954 )
								if( k <= 98.2256 )
									ret := 0.355311
								if( k > 98.2256 )
									ret := 0.083779
			if( bullPower > 0.328707 )
				if( BBPower_Color <= 0.5 )
					if( smoothD_d <= 26.1637 )
						if( d_k <= -17.6525 )
							ret := 0.266667
						if( d_k > -17.6525 )
							ret := 0.933333 // buy
					if( smoothD_d > 26.1637 )
						if( bullPower <= 0.438886 )
							if( bbm <= 0.520815 )
								if( k <= 62.0377 )
									ret := -0.764706 // sell
								if( k > 62.0377 )
									ret := 0.800000 // buy
							if( bbm > 0.520815 )
								if( bullPower <= 0.363921 )
									ret := -0.274194
								if( bullPower > 0.363921 )
									ret := -0.666667
						if( bullPower > 0.438886 )
							if( smoothK_k <= 87.734 )
								if( rsi1 <= 37.1669 )
									ret := 0.972222 // buy
								if( rsi1 > 37.1669 )
									ret := -0.072072
							if( smoothK_k > 87.734 )
								ret := -0.846154 // sell
				if( BBPower_Color > 0.5 )
					if( rsi1 <= 77.4862 )
						if( smoothD_d <= 17.4372 )
							if( rsi1 <= 44.8378 )
								ret := 0.500000
							if( rsi1 > 44.8378 )
								ret := 1.000000 // buy
						if( smoothD_d > 17.4372 )
							if( d_k <= -29.0422 )
								ret := 0.769231 // buy
							if( d_k > -29.0422 )
								if( smoothD_d <= 87.2008 )
									ret := -0.360308
								if( smoothD_d > 87.2008 )
									ret := 0.134831
					if( rsi1 > 77.4862 )
						if( bbm <= 1.0928 )
							if( k <= 75.5937 )
								ret := 0.250000
							if( k > 75.5937 )
								if( d <= 92.7376 )
									ret := -0.903226 // sell
								if( d > 92.7376 )
									ret := -0.333333
						if( bbm > 1.0928 )
							if( d <= 50.7709 )
								ret := -0.571429
							if( d > 50.7709 )
								ret := -1.000000 // sell
	if( bearPower > -0.088016 )
		if( bearPower <= 1.02075 )
			if( bullPower <= 0.062971 )
				if( smoothK_k <= 95.3083 )
					if( bbp <= -0.133417 )
						if( d_k <= 13.9349 )
							if( rsi1 <= 49.4855 )
								if( smoothD_d <= 56.6061 )
									ret := 0.097847
								if( smoothD_d > 56.6061 )
									ret := -0.339623
							if( rsi1 > 49.4855 )
								if( k <= 70.5298 )
									ret := 0.368421
								if( k > 70.5298 )
									ret := 0.039216
						if( d_k > 13.9349 )
							if( bbm <= 0.001313 )
								if( smoothD_d <= 45.2871 )
									ret := -0.031250
								if( smoothD_d > 45.2871 )
									ret := 0.346154
							if( bbm > 0.001313 )
								if( bbp <= -0.142127 )
									ret := 0.750000 // buy
								if( bbp > -0.142127 )
									ret := 0.333333
					if( bbp > -0.133417 )
						if( rsi1 <= 60.6687 )
							if( smoothD_d <= -2.81056 )
								if( rsi1 <= 51.9824 )
									ret := -0.395604
								if( rsi1 > 51.9824 )
									ret := 0.562500
							if( smoothD_d > -2.81056 )
								if( bearPower <= -0.087948 )
									ret := -0.588235
								if( bearPower > -0.087948 )
									ret := -0.011447
						if( rsi1 > 60.6687 )
							if( rsi1 <= 63.0789 )
								if( bbp <= 0.046412 )
									ret := 0.179372
								if( bbp > 0.046412 )
									ret := 0.005333
							if( rsi1 > 63.0789 )
								if( bearPower <= -0.053544 )
									ret := -0.260870
								if( bearPower > -0.053544 )
									ret := 0.026667
				if( smoothK_k > 95.3083 )
					if( BBPower_Color <= 0.5 )
						if( smoothK_k <= 96.5745 )
							if( bullPower <= 0.028824 )
								if( bbp <= -0.077766 )
									ret := 0.869565 // buy
								if( bbp > -0.077766 )
									ret := 0.106383
							if( bullPower > 0.028824 )
								if( d <= 94.1054 )
									ret := 0.615385
								if( d > 94.1054 )
									ret := 0.962963 // buy
						if( smoothK_k > 96.5745 )
							if( bbp <= -0.011459 )
								if( d_k <= -8.69509 )
									ret := 0.405405
								if( d_k > -8.69509 )
									ret := -0.063291
							if( bbp > -0.011459 )
								if( rsi1 <= 47.0035 )
									ret := 0.111111
								if( rsi1 > 47.0035 )
									ret := 0.591837
					if( BBPower_Color > 0.5 )
						if( k <= 98.8302 )
							if( d_k <= -8.54035 )
								ret := 0.812500 // buy
							if( d_k > -8.54035 )
								if( d <= 98.9365 )
									ret := -0.170732
								if( d > 98.9365 )
									ret := 0.538462
						if( k > 98.8302 )
							if( smoothK_k <= 96.2071 )
								if( rsi1 <= 54.0809 )
									ret := -0.777778 // sell
								if( rsi1 > 54.0809 )
									ret := -0.111111
							if( smoothK_k > 96.2071 )
								if( bearPower <= 0.060465 )
									ret := 0.044715
								if( bearPower > 0.060465 )
									ret := -0.285714
			if( bullPower > 0.062971 )
				if( smoothD_d <= -0.078353 )
					if( smoothD_d <= -2.8494 )
						if( bullPower <= 0.383014 )
							if( d <= 0.00161 )
								if( bbm <= 0.121286 )
									ret := 0.333333
								if( bbm > 0.121286 )
									ret := 0.846154 // buy
							if( d > 0.00161 )
								ret := 0.958333 // buy
						if( bullPower > 0.383014 )
							ret := -0.375000
					if( smoothD_d > -2.8494 )
						if( rsi1 <= 62.3472 )
							if( bearPower <= -0.044369 )
								if( bbp <= 0.064633 )
									ret := 0.482143
								if( bbp > 0.064633 )
									ret := -0.176471
							if( bearPower > -0.044369 )
								if( d_k <= -0.450406 )
									ret := 0.204724
								if( d_k > -0.450406 )
									ret := -0.232673
						if( rsi1 > 62.3472 )
							if( k <= 0.585409 )
								ret := 1.000000 // buy
							if( k > 0.585409 )
								if( bullPower <= 0.323611 )
									ret := -0.142857
								if( bullPower > 0.323611 )
									ret := 0.818182 // buy
				if( smoothD_d > -0.078353 )
					if( d <= 50.5584 )
						if( rsi1 <= 61.1773 )
							if( bullPower <= 0.479369 )
								if( bearPower <= 0.143853 )
									ret := -0.058885
								if( bearPower > 0.143853 )
									ret := -0.321063
							if( bullPower > 0.479369 )
								if( smoothK_k <= -2.1421 )
									ret := 0.947368 // buy
								if( smoothK_k > -2.1421 )
									ret := 0.168317
						if( rsi1 > 61.1773 )
							if( d <= 18.5743 )
								if( smoothD_d <= 15.4113 )
									ret := -0.080602
								if( smoothD_d > 15.4113 )
									ret := 0.777778 // buy
							if( d > 18.5743 )
								if( bbm <= 0.043982 )
									ret := -0.014085
								if( bbm > 0.043982 )
									ret := -0.195520
					if( d > 50.5584 )
						if( smoothK_k <= 80.0803 )
							if( bullPower <= 0.226997 )
								if( bbp <= -0.005908 )
									ret := -0.508475
								if( bbp > -0.005908 )
									ret := -0.025465
							if( bullPower > 0.226997 )
								if( rsi1 <= 72.7179 )
									ret := 0.028341
								if( rsi1 > 72.7179 )
									ret := 0.196834
						if( smoothK_k > 80.0803 )
							if( d_k <= -30.7604 )
								if( k <= 92.0454 )
									ret := 0.714286 // buy
								if( k > 92.0454 )
									ret := -0.279070
							if( d_k > -30.7604 )
								if( bbm <= 0.386472 )
									ret := -0.079661
								if( bbm > 0.386472 )
									ret := 0.033233
		if( bearPower > 1.02075 )
			if( d_k <= -0.09499 )
				if( d_k <= -1.72089 )
					if( rsi1 <= 90.8368 )
						if( k <= 79.9438 )
							if( d <= 31.8172 )
								ret := 0.818182 // buy
							if( d > 31.8172 )
								ret := -0.461538
						if( k > 79.9438 )
							if( bullPower <= 1.68367 )
								if( k <= 97.3677 )
									ret := 0.461538
								if( k > 97.3677 )
									ret := 0.900000 // buy
							if( bullPower > 1.68367 )
								ret := 1.000000 // buy
					if( rsi1 > 90.8368 )
						ret := -0.857143 // sell
				if( d_k > -1.72089 )
					if( bbp <= 4.61369 )
						ret := 0.222222
					if( bbp > 4.61369 )
						ret := -1.000000 // sell
			if( d_k > -0.09499 )
				if( d_k <= 8.19323 )
					if( k <= 29.2783 )
						ret := 0.111111
					if( k > 29.2783 )
						if( smoothK_k <= 95.6936 )
							if( bearPower <= 1.3282 )
								ret := 1.000000 // buy
							if( bearPower > 1.3282 )
								ret := 0.733333 // buy
						if( smoothK_k > 95.6936 )
							ret := 0.500000
				if( d_k > 8.19323 )
					ret := 1.000000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bull_Bear_Power 
//@version=5
//indicator "Bull Bear Power", shorttitle="BBP")
lengthInput = input.int(13, title="Length")
bullPower = high - ta.ema(close, lengthInput)
bearPower = low - ta.ema(close, lengthInput)
bbp = bullPower + bearPower

bbm = bullPower - bearPower

plot(bbp, color = bbp >= 0 ? #089981 : #f23645, title="BBPower", style = plot.style_columns)
hline(0, "Zero line")

BBPower_Color = bbp >= 0  ? 1: 0


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
float op_operation = decision_tree_0_AAPL_1Min_29e5a8df(bullPower, bbp, bearPower, bbm, BBPower_Color, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


