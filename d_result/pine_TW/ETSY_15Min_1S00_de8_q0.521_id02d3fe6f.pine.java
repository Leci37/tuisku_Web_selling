//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI
// ID_model: ETSY_15Min_1S00_02d3fe6f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ETSY_15Min_1S00_02d3fe6f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ETSY_15Min_02d3fe6f(d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( smoothK_k <= 0.578391 )
		if( d <= 0.034384 )
			if( d <= 0.000712 )
				ret := 0.189979
			if( d > 0.000712 )
				if( d_k <= 0.0134 )
					if( rsi1 <= 29.7324 )
						if( d_k <= -0.018 )
							if( smoothD_d <= -2.97865 )
								ret := -0.363636
							if( smoothD_d > -2.97865 )
								ret := 0.000000
						if( d_k > -0.018 )
							if( d_k <= -6e-06 )
								if( rsi1 <= 13.7281 )
									ret := 1.000000 // buy
								if( rsi1 > 13.7281 )
									ret := 0.294118
							if( d_k > -6e-06 )
								ret := 0.125000
					if( rsi1 > 29.7324 )
						if( rsi1 <= 37.1486 )
							ret := 1.000000 // buy
						if( rsi1 > 37.1486 )
							ret := 0.500000
				if( d_k > 0.0134 )
					if( d_k <= 0.02536 )
						if( smoothD_d <= -2.98425 )
							ret := 0.666667
						if( smoothD_d > -2.98425 )
							ret := 1.000000 // buy
					if( d_k > 0.02536 )
						ret := 0.333333
		if( d > 0.034384 )
			if( k <= 1.50528 )
				if( k <= 0.092269 )
					if( smoothD_d <= -2.92172 )
						if( d <= 0.037191 )
							ret := -0.833333 // sell
						if( d > 0.037191 )
							if( d <= 0.059101 )
								if( d_k <= 0.014726 )
									ret := -0.307692
								if( d_k > 0.014726 )
									ret := 0.166667
							if( d > 0.059101 )
								if( smoothD_d <= -2.92982 )
									ret := -0.888889 // sell
								if( smoothD_d > -2.92982 )
									ret := -0.272727
					if( smoothD_d > -2.92172 )
						if( d_k <= 0.279487 )
							if( smoothK_k <= -2.94844 )
								if( rsi1 <= 8.61817 )
									ret := 1.000000 // buy
								if( rsi1 > 8.61817 )
									ret := 0.329787
							if( smoothK_k > -2.94844 )
								ret := 0.000000
						if( d_k > 0.279487 )
							if( d_k <= 0.438833 )
								if( smoothD_d <= -2.59359 )
									ret := -0.220588
								if( smoothD_d > -2.59359 )
									ret := -0.590909
							if( d_k > 0.438833 )
								if( d <= 1.60567 )
									ret := 0.265714
								if( d > 1.60567 )
									ret := 0.099532
				if( k > 0.092269 )
					if( d_k <= 0.057295 )
						if( d <= 0.86467 )
							if( rsi1 <= 8.8093 )
								if( rsi1 <= 5.50312 )
									ret := 0.789474 // buy
								if( rsi1 > 5.50312 )
									ret := 0.468750
							if( rsi1 > 8.8093 )
								if( smoothK_k <= -2.88704 )
									ret := -0.750000 // sell
								if( smoothK_k > -2.88704 )
									ret := -0.151452
						if( d > 0.86467 )
							if( smoothK_k <= -1.54205 )
								if( smoothD_d <= -2.02417 )
									ret := -0.729730 // sell
								if( smoothD_d > -2.02417 )
									ret := -0.486111
							if( smoothK_k > -1.54205 )
								ret := -0.105263
					if( d_k > 0.057295 )
						if( smoothD_d <= -0.576886 )
							if( k <= 1.22751 )
								if( d_k <= 1.87404 )
									ret := 0.232877
								if( d_k > 1.87404 )
									ret := -0.625000
							if( k > 1.22751 )
								if( d_k <= 0.269413 )
									ret := 0.133333
								if( d_k > 0.269413 )
									ret := 0.758621 // buy
						if( smoothD_d > -0.576886 )
							if( d <= 6.03129 )
								if( rsi1 <= 15.5342 )
									ret := 0.369231
								if( rsi1 > 15.5342 )
									ret := -0.338710
							if( d > 6.03129 )
								if( d <= 20.4894 )
									ret := 0.163235
								if( d > 20.4894 )
									ret := -0.277108
			if( k > 1.50528 )
				if( rsi1 <= 22.9258 )
					if( d <= 2.92656 )
						if( rsi1 <= 15.377 )
							if( smoothD_d <= -1.85925 )
								if( smoothK_k <= -0.923948 )
									ret := -0.142857
								if( smoothK_k > -0.923948 )
									ret := -0.880000 // sell
							if( smoothD_d > -1.85925 )
								if( smoothK_k <= 0.043971 )
									ret := 0.202532
								if( smoothK_k > 0.043971 )
									ret := -0.666667
						if( rsi1 > 15.377 )
							if( rsi1 <= 19.1105 )
								if( d <= 2.10803 )
									ret := 0.068966
								if( d > 2.10803 )
									ret := 0.625000
							if( rsi1 > 19.1105 )
								if( k <= 3.0767 )
									ret := 0.797101 // buy
								if( k > 3.0767 )
									ret := 0.303030
					if( d > 2.92656 )
						if( d_k <= 1.02779 )
							if( k <= 3.36062 )
								if( smoothD_d <= 0.465639 )
									ret := 0.974359 // buy
								if( smoothD_d > 0.465639 )
									ret := 0.857143 // buy
							if( k > 3.36062 )
								ret := 0.400000
						if( d_k > 1.02779 )
							if( d <= 4.20606 )
								if( smoothD_d <= 0.378483 )
									ret := 0.750000 // buy
								if( smoothD_d > 0.378483 )
									ret := -0.120000
							if( d > 4.20606 )
								if( rsi1 <= 22.3644 )
									ret := 0.603774
								if( rsi1 > 22.3644 )
									ret := 0.000000
				if( rsi1 > 22.9258 )
					if( smoothD_d <= 0.197818 )
						if( d_k <= -0.06019 )
							if( d_k <= -0.270693 )
								if( d_k <= -1.54652 )
									ret := 0.468750
								if( d_k > -1.54652 )
									ret := 0.125874
							if( d_k > -0.270693 )
								if( k <= 3.07496 )
									ret := -0.350877
								if( k > 3.07496 )
									ret := -0.875000 // sell
						if( d_k > -0.06019 )
							if( smoothD_d <= -0.670656 )
								if( rsi1 <= 32.2369 )
									ret := -0.235294
								if( rsi1 > 32.2369 )
									ret := 0.161290
							if( smoothD_d > -0.670656 )
								if( rsi1 <= 30.2148 )
									ret := 0.254545
								if( rsi1 > 30.2148 )
									ret := 0.661765
					if( smoothD_d > 0.197818 )
						if( rsi1 <= 23.989 )
							if( smoothD_d <= 3.19543 )
								if( smoothK_k <= -0.179316 )
									ret := -1.000000 // sell
								if( smoothK_k > -0.179316 )
									ret := -0.666667
							if( smoothD_d > 3.19543 )
								if( d <= 10.4766 )
									ret := 0.600000
								if( d > 10.4766 )
									ret := -0.550000
						if( rsi1 > 23.989 )
							if( rsi1 <= 31.5779 )
								if( d_k <= 14.9541 )
									ret := 0.220472
								if( d_k > 14.9541 )
									ret := -0.560000
							if( rsi1 > 31.5779 )
								if( d_k <= 8.06793 )
									ret := -0.156923
								if( d_k > 8.06793 )
									ret := 0.093677
	if( smoothK_k > 0.578391 )
		if( d_k <= 4.22102 )
			if( k <= 99.9981 )
				if( smoothD_d <= 42.1818 )
					if( d <= 31.7061 )
						if( d_k <= -0.94493 )
							if( d <= 26.8327 )
								if( smoothD_d <= 22.7453 )
									ret := -0.043840
								if( smoothD_d > 22.7453 )
									ret := -0.202401
							if( d > 26.8327 )
								if( rsi1 <= 44.1509 )
									ret := -0.090909
								if( rsi1 > 44.1509 )
									ret := 0.121612
						if( d_k > -0.94493 )
							if( rsi1 <= 9.28583 )
								if( d <= 5.01237 )
									ret := 1.000000 // buy
								if( d > 5.01237 )
									ret := 0.750000 // buy
							if( rsi1 > 9.28583 )
								if( smoothD_d <= 26.4847 )
									ret := 0.017575
								if( smoothD_d > 26.4847 )
									ret := 0.325733
					if( d > 31.7061 )
						if( smoothK_k <= 28.2821 )
							if( k <= 28.7671 )
								ret := -0.090909
							if( k > 28.7671 )
								if( smoothD_d <= 30.8733 )
									ret := -0.728682 // sell
								if( smoothD_d > 30.8733 )
									ret := -0.294118
						if( smoothK_k > 28.2821 )
							if( k <= 64.8743 )
								if( d_k <= -9.21956 )
									ret := -0.157400
								if( d_k > -9.21956 )
									ret := -0.047727
							if( k > 64.8743 )
								if( rsi1 <= 72.3051 )
									ret := 0.167095
								if( rsi1 > 72.3051 )
									ret := -0.412500
				if( smoothD_d > 42.1818 )
					if( rsi1 <= 55.0927 )
						if( d <= 99.769 )
							if( smoothK_k <= 49.6957 )
								if( rsi1 <= 43.3234 )
									ret := 0.028708
								if( rsi1 > 43.3234 )
									ret := 0.262042
							if( smoothK_k > 49.6957 )
								if( smoothK_k <= 65.3573 )
									ret := -0.029430
								if( smoothK_k > 65.3573 )
									ret := 0.054392
						if( d > 99.769 )
							if( d_k <= 0.033404 )
								ret := -0.555556
							if( d_k > 0.033404 )
								ret := -1.000000 // sell
					if( rsi1 > 55.0927 )
						if( smoothK_k <= 85.9192 )
							if( d_k <= -10.1886 )
								if( d <= 67.738 )
									ret := -0.014388
								if( d > 67.738 )
									ret := -0.253707
							if( d_k > -10.1886 )
								if( k <= 88.725 )
									ret := 0.020721
								if( k > 88.725 )
									ret := 0.541667
						if( smoothK_k > 85.9192 )
							if( k <= 98.3196 )
								if( smoothD_d <= 60.5796 )
									ret := -0.573529
								if( smoothD_d > 60.5796 )
									ret := -0.074346
							if( k > 98.3196 )
								if( d <= 99.6193 )
									ret := 0.068747
								if( d > 99.6193 )
									ret := -0.148990
			if( k > 99.9981 )
				if( smoothK_k <= 96.9994 )
					ret := -1.000000 // sell
				if( smoothK_k > 96.9994 )
					if( smoothD_d <= 74.909 )
						if( d_k <= -29.7189 )
							if( smoothD_d <= 65.0851 )
								ret := 0.000000
							if( smoothD_d > 65.0851 )
								ret := 0.250000
						if( d_k > -29.7189 )
							if( smoothD_d <= 71.9465 )
								if( d <= 72.9539 )
									ret := -0.266667
								if( d > 72.9539 )
									ret := -0.888889 // sell
							if( smoothD_d > 71.9465 )
								if( smoothD_d <= 73.5565 )
									ret := -0.150000
								if( smoothD_d > 73.5565 )
									ret := -0.454545
					if( smoothD_d > 74.909 )
						if( rsi1 <= 54.6739 )
							if( d <= 98.6265 )
								if( d <= 90.3397 )
									ret := -0.242718
								if( d > 90.3397 )
									ret := -0.535714
							if( d > 98.6265 )
								if( smoothD_d <= 96.9764 )
									ret := 0.563636
								if( smoothD_d > 96.9764 )
									ret := -0.577465
						if( rsi1 > 54.6739 )
							if( smoothD_d <= 90.4384 )
								if( d_k <= -8.97541 )
									ret := -0.017241
								if( d_k > -8.97541 )
									ret := 0.266234
							if( smoothD_d > 90.4384 )
								if( d_k <= -5.41907 )
									ret := -0.396694
								if( d_k > -5.41907 )
									ret := -0.068640
		if( d_k > 4.22102 )
			if( rsi1 <= 28.4187 )
				if( smoothK_k <= 32.4112 )
					if( smoothD_d <= 39.0497 )
						if( smoothD_d <= 12.1881 )
							if( d <= 9.07141 )
								ret := 0.565217
							if( d > 9.07141 )
								if( rsi1 <= 15.16 )
									ret := 0.333333
								if( rsi1 > 15.16 )
									ret := -0.255000
						if( smoothD_d > 12.1881 )
							if( k <= 7.73936 )
								if( d <= 35.4099 )
									ret := 0.576271
								if( d > 35.4099 )
									ret := 0.000000
							if( k > 7.73936 )
								if( rsi1 <= 17.2735 )
									ret := 0.431818
								if( rsi1 > 17.2735 )
									ret := 0.105618
					if( smoothD_d > 39.0497 )
						if( d <= 46.7235 )
							if( smoothK_k <= 20.2772 )
								if( rsi1 <= 24.061 )
									ret := -0.906250 // sell
								if( rsi1 > 24.061 )
									ret := -0.600000
							if( smoothK_k > 20.2772 )
								if( d_k <= 17.6205 )
									ret := -0.534884
								if( d_k > 17.6205 )
									ret := 0.200000
						if( d > 46.7235 )
							if( k <= 25.1265 )
								if( d_k <= 31.4498 )
									ret := 0.897436 // buy
								if( d_k > 31.4498 )
									ret := 0.307692
							if( k > 25.1265 )
								if( smoothK_k <= 29.3998 )
									ret := 0.062500
								if( smoothK_k > 29.3998 )
									ret := -0.507042
				if( smoothK_k > 32.4112 )
					if( rsi1 <= 16.0088 )
						ret := -0.294118
					if( rsi1 > 16.0088 )
						if( d_k <= 20.2553 )
							if( d_k <= 6.99531 )
								if( smoothK_k <= 67.427 )
									ret := 0.054054
								if( smoothK_k > 67.427 )
									ret := 0.764706 // buy
							if( d_k > 6.99531 )
								if( d <= 85.5793 )
									ret := 0.700375 // buy
								if( d > 85.5793 )
									ret := -0.071429
						if( d_k > 20.2553 )
							if( rsi1 <= 25.9638 )
								if( rsi1 <= 22.894 )
									ret := 0.769231 // buy
								if( rsi1 > 22.894 )
									ret := 0.350000
							if( rsi1 > 25.9638 )
								if( k <= 53.0527 )
									ret := -0.794872 // sell
								if( k > 53.0527 )
									ret := 0.000000
			if( rsi1 > 28.4187 )
				if( d_k <= 24.253 )
					if( smoothK_k <= 77.618 )
						if( d <= 16.5508 )
							if( smoothD_d <= 5.85909 )
								if( d <= 8.74238 )
									ret := 0.200000
								if( d > 8.74238 )
									ret := 0.800000 // buy
							if( smoothD_d > 5.85909 )
								if( rsi1 <= 29.1479 )
									ret := -0.714286 // sell
								if( rsi1 > 29.1479 )
									ret := -0.122642
						if( d > 16.5508 )
							if( d <= 91.0504 )
								if( rsi1 <= 75.4988 )
									ret := 0.005322
								if( rsi1 > 75.4988 )
									ret := 0.160862
							if( d > 91.0504 )
								if( d_k <= 11.5829 )
									ret := -0.722222 // sell
								if( d_k > 11.5829 )
									ret := -0.233766
					if( smoothK_k > 77.618 )
						if( d <= 86.7631 )
							if( k <= 81.3237 )
								if( rsi1 <= 53.1736 )
									ret := 0.304348
								if( rsi1 > 53.1736 )
									ret := 0.863636 // buy
							if( k > 81.3237 )
								if( d <= 86.5729 )
									ret := 0.458333
								if( d > 86.5729 )
									ret := 0.076923
						if( d > 86.7631 )
							if( smoothK_k <= 85.5164 )
								if( smoothD_d <= 87.7424 )
									ret := 0.005450
								if( smoothD_d > 87.7424 )
									ret := 0.208897
							if( smoothK_k > 85.5164 )
								if( d <= 94.1486 )
									ret := -0.500000
								if( d > 94.1486 )
									ret := 0.011164
				if( d_k > 24.253 )
					if( k <= 27.7315 )
						if( smoothK_k <= 1.87902 )
							if( rsi1 <= 42.945 )
								ret := -0.818182 // sell
							if( rsi1 > 42.945 )
								ret := -0.500000
						if( smoothK_k > 1.87902 )
							if( d <= 50.7432 )
								if( smoothD_d <= 42.6656 )
									ret := -0.017073
								if( smoothD_d > 42.6656 )
									ret := 0.377049
							if( d > 50.7432 )
								if( rsi1 <= 30.1947 )
									ret := -0.937500 // sell
								if( rsi1 > 30.1947 )
									ret := -0.125786
					if( k > 27.7315 )
						if( smoothD_d <= 63.8065 )
							if( rsi1 <= 40.854 )
								if( rsi1 <= 39.953 )
									ret := 0.343434
								if( rsi1 > 39.953 )
									ret := -0.518519
							if( rsi1 > 40.854 )
								if( rsi1 <= 52.9227 )
									ret := 0.607306
								if( rsi1 > 52.9227 )
									ret := 0.184615
						if( smoothD_d > 63.8065 )
							if( k <= 43.8621 )
								if( smoothK_k <= 36.4106 )
									ret := 0.324324
								if( smoothK_k > 36.4106 )
									ret := -0.436782
							if( k > 43.8621 )
								if( smoothK_k <= 46.3986 )
									ret := 0.472441
								if( smoothK_k > 46.3986 )
									ret := 0.146341
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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
float op_operation = decision_tree_0_ETSY_15Min_02d3fe6f(d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


