//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: BNBUSDT_30Min_2TV0_83d70315 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BNBUSDT_30Min_2TV0_83d70315", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BNBUSDT_30Min_83d70315(ema3, tema, ema2, ema12, ema13, ema1, VIP, VIM, VIP_VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema3 <= 577.989 )
		if( ema2 <= 208.625 )
			if( ema13 <= 1.01595 )
				if( ema12 <= -0.677742 )
					if( ema2 <= 132.572 )
						if( tema <= 123.23 )
							if( ema3 <= 41.2137 )
								if( ema2 <= 38.79 )
									ret := 0.636364
								if( ema2 > 38.79 )
									ret := 1.000000 // buy
							if( ema3 > 41.2137 )
								if( tema <= 40.7575 )
									ret := -0.833333 // sell
								if( tema > 40.7575 )
									ret := 0.666667
						if( tema > 123.23 )
							if( ema13 <= -4.36686 )
								ret := 0.800000 // buy
							if( ema13 > -4.36686 )
								if( ema1 <= 130.196 )
									ret := 1.000000 // buy
								if( ema1 > 130.196 )
									ret := 0.833333 // buy
					if( ema2 > 132.572 )
						if( VIP <= 0.908136 )
							if( ema3 <= 134.215 )
								if( ema3 <= 133.832 )
									ret := -0.250000
								if( ema3 > 133.832 )
									ret := -1.000000 // sell
							if( ema3 > 134.215 )
								if( ema1 <= 194.272 )
									ret := 0.954545 // buy
								if( ema1 > 194.272 )
									ret := 0.254902
						if( VIP > 0.908136 )
							if( ema12 <= -1.0289 )
								if( VIM <= 1.02328 )
									ret := -0.750000 // sell
								if( VIM > 1.02328 )
									ret := -1.000000 // sell
							if( ema12 > -1.0289 )
								ret := -0.333333
				if( ema12 > -0.677742 )
					if( ema12 <= 0.191128 )
						if( ema13 <= -1.00837 )
							if( ema13 <= -1.24548 )
								if( ema1 <= 200.457 )
									ret := -0.923077 // sell
								if( ema1 > 200.457 )
									ret := -0.200000
							if( ema13 > -1.24548 )
								if( VIP <= 0.810393 )
									ret := 0.000000
								if( VIP > 0.810393 )
									ret := -0.396825
						if( ema13 > -1.00837 )
							if( tema <= 19.0006 )
								if( ema2 <= 19.4222 )
									ret := 1.000000 // buy
								if( ema2 > 19.4222 )
									ret := -0.200000
							if( tema > 19.0006 )
								if( tema <= 20.2311 )
									ret := -0.823529 // sell
								if( tema > 20.2311 )
									ret := 0.128072
					if( ema12 > 0.191128 )
						if( ema2 <= 43.2798 )
							if( VIP_VIM <= 0.602295 )
								if( tema <= 26.5449 )
									ret := 0.131034
								if( tema > 26.5449 )
									ret := -0.173404
							if( VIP_VIM > 0.602295 )
								if( ema13 <= 0.63423 )
									ret := 0.114754
								if( ema13 > 0.63423 )
									ret := 0.574468
						if( ema2 > 43.2798 )
							if( ema13 <= 0.506614 )
								if( VIP <= 1.12195 )
									ret := 0.177778
								if( VIP > 1.12195 )
									ret := 0.678571
							if( ema13 > 0.506614 )
								if( tema <= 72.8466 )
									ret := 0.101351
								if( tema > 72.8466 )
									ret := -0.360360
			if( ema13 > 1.01595 )
				if( tema <= 135.012 )
					if( VIM <= 0.654256 )
						if( VIP <= 1.26942 )
							if( ema2 <= 36.5016 )
								ret := -0.750000 // sell
							if( ema2 > 36.5016 )
								ret := -1.000000 // sell
						if( VIP > 1.26942 )
							if( ema2 <= 80.7325 )
								if( ema12 <= 0.732606 )
									ret := 0.875000 // buy
								if( ema12 > 0.732606 )
									ret := -0.608696
							if( ema2 > 80.7325 )
								if( ema1 <= 87.7268 )
									ret := 1.000000 // buy
								if( ema1 > 87.7268 )
									ret := 0.500000
					if( VIM > 0.654256 )
						if( ema3 <= 72.2418 )
							if( tema <= 73.7136 )
								if( ema1 <= 57.6717 )
									ret := 0.317757
								if( ema1 > 57.6717 )
									ret := 0.765766 // buy
							if( tema > 73.7136 )
								if( ema3 <= 69.294 )
									ret := 0.750000 // buy
								if( ema3 > 69.294 )
									ret := -0.950000 // sell
						if( ema3 > 72.2418 )
							if( ema3 <= 131.17 )
								if( VIP_VIM <= 0.232361 )
									ret := 0.563636
								if( VIP_VIM > 0.232361 )
									ret := 0.942529 // buy
							if( ema3 > 131.17 )
								if( ema1 <= 134.425 )
									ret := -1.000000 // sell
								if( ema1 > 134.425 )
									ret := 0.600000
				if( tema > 135.012 )
					if( ema3 <= 134.096 )
						if( tema <= 135.681 )
							if( ema2 <= 131.292 )
								ret := 1.000000 // buy
							if( ema2 > 131.292 )
								if( ema12 <= 0.656585 )
									ret := -0.750000 // sell
								if( ema12 > 0.656585 )
									ret := -0.500000
						if( tema > 135.681 )
							if( ema2 <= 133.787 )
								if( ema13 <= 5.40176 )
									ret := -1.000000 // sell
								if( ema13 > 5.40176 )
									ret := -0.833333 // sell
							if( ema2 > 133.787 )
								if( ema3 <= 131.126 )
									ret := -1.000000 // sell
								if( ema3 > 131.126 )
									ret := 0.000000
					if( ema3 > 134.096 )
						if( VIM <= 0.979812 )
							if( VIP_VIM <= 0.135091 )
								if( VIP <= 1.04321 )
									ret := 0.000000
								if( VIP > 1.04321 )
									ret := -1.000000 // sell
							if( VIP_VIM > 0.135091 )
								if( tema <= 209.967 )
									ret := 0.265487
								if( tema > 209.967 )
									ret := 0.871795 // buy
						if( VIM > 0.979812 )
							if( ema2 <= 165.812 )
								ret := 0.750000 // buy
							if( ema2 > 165.812 )
								ret := 1.000000 // buy
		if( ema2 > 208.625 )
			if( ema12 <= -0.896919 )
				if( ema12 <= -16.8307 )
					if( VIM <= 1.33922 )
						ret := 1.000000 // buy
					if( VIM > 1.33922 )
						ret := 0.800000 // buy
				if( ema12 > -16.8307 )
					if( VIP_VIM <= -0.270537 )
						if( tema <= 321.651 )
							if( ema1 <= 325.663 )
								if( tema <= 206.868 )
									ret := 0.727273 // buy
								if( tema > 206.868 )
									ret := 0.114372
							if( ema1 > 325.663 )
								if( ema3 <= 349.963 )
									ret := 0.960000 // buy
								if( ema3 > 349.963 )
									ret := -0.500000
						if( tema > 321.651 )
							if( ema1 <= 324.709 )
								if( VIP_VIM <= -0.302859 )
									ret := -0.828571 // sell
								if( VIP_VIM > -0.302859 )
									ret := 0.400000
							if( ema1 > 324.709 )
								if( ema12 <= -5.39757 )
									ret := 0.145354
								if( ema12 > -5.39757 )
									ret := -0.005967
					if( VIP_VIM > -0.270537 )
						if( ema13 <= -10.5138 )
							if( ema2 <= 556.623 )
								if( ema13 <= -14.5188 )
									ret := 0.302326
								if( ema13 > -14.5188 )
									ret := 0.855263 // buy
							if( ema2 > 556.623 )
								if( ema12 <= -5.01017 )
									ret := -1.000000 // sell
								if( ema12 > -5.01017 )
									ret := 0.600000
						if( ema13 > -10.5138 )
							if( ema3 <= 219.651 )
								if( ema3 <= 212.303 )
									ret := 0.777778 // buy
								if( ema3 > 212.303 )
									ret := -0.727273 // sell
							if( ema3 > 219.651 )
								if( ema13 <= -8.41428 )
									ret := -0.365217
								if( ema13 > -8.41428 )
									ret := 0.152114
			if( ema12 > -0.896919 )
				if( ema12 <= 8.69496 )
					if( ema13 <= 11.4093 )
						if( ema13 <= 0.252013 )
							if( ema3 <= 550.547 )
								if( ema1 <= 233.704 )
									ret := 0.083847
								if( ema1 > 233.704 )
									ret := -0.016527
							if( ema3 > 550.547 )
								if( VIP_VIM <= 0.001574 )
									ret := 0.079190
								if( VIP_VIM > 0.001574 )
									ret := 0.386139
						if( ema13 > 0.252013 )
							if( tema <= 583.04 )
								if( ema3 <= 232.207 )
									ret := -0.042962
								if( ema3 > 232.207 )
									ret := 0.058250
							if( tema > 583.04 )
								if( VIM <= 0.923941 )
									ret := -0.369697
								if( VIM > 0.923941 )
									ret := 0.750000 // buy
					if( ema13 > 11.4093 )
						if( VIM <= 0.748515 )
							if( tema <= 464.621 )
								if( VIM <= 0.706889 )
									ret := -0.204545
								if( VIM > 0.706889 )
									ret := 0.269231
							if( tema > 464.621 )
								if( ema3 <= 479.312 )
									ret := 0.818182 // buy
								if( ema3 > 479.312 )
									ret := 0.266667
						if( VIM > 0.748515 )
							if( VIP <= 1.04931 )
								ret := -1.000000 // sell
							if( VIP > 1.04931 )
								if( ema12 <= 8.56294 )
									ret := 0.656522
								if( ema12 > 8.56294 )
									ret := -0.500000
				if( ema12 > 8.69496 )
					if( tema <= 477.968 )
						if( ema3 <= 218.828 )
							if( ema1 <= 230.23 )
								ret := 1.000000 // buy
							if( ema1 > 230.23 )
								ret := 0.500000
						if( ema3 > 218.828 )
							if( VIP_VIM <= 0.328236 )
								if( ema2 <= 306.306 )
									ret := 0.933333 // buy
								if( ema2 > 306.306 )
									ret := -0.894737 // sell
							if( VIP_VIM > 0.328236 )
								if( tema <= 261.969 )
									ret := 0.333333
								if( tema > 261.969 )
									ret := -0.750000 // sell
					if( tema > 477.968 )
						if( tema <= 594.256 )
							if( ema2 <= 529.486 )
								if( ema3 <= 496.019 )
									ret := 0.433333
								if( ema3 > 496.019 )
									ret := -0.512821
							if( ema2 > 529.486 )
								if( ema12 <= 17.0519 )
									ret := 0.559322
								if( ema12 > 17.0519 )
									ret := -1.000000 // sell
						if( tema > 594.256 )
							if( ema1 <= 583.782 )
								ret := -0.250000
							if( ema1 > 583.782 )
								if( ema13 <= 17.9835 )
									ret := -0.750000 // sell
								if( ema13 > 17.9835 )
									ret := -1.000000 // sell
	if( ema3 > 577.989 )
		if( ema13 <= -13.1933 )
			if( VIP_VIM <= -0.224105 )
				if( ema3 <= 600.218 )
					if( ema1 <= 567.46 )
						if( VIP_VIM <= -0.598316 )
							if( VIP_VIM <= -0.644832 )
								ret := 1.000000 // buy
							if( VIP_VIM > -0.644832 )
								ret := 0.750000 // buy
						if( VIP_VIM > -0.598316 )
							if( ema1 <= 564.685 )
								if( tema <= 537.532 )
									ret := 0.750000 // buy
								if( tema > 537.532 )
									ret := -0.333333
							if( ema1 > 564.685 )
								ret := 1.000000 // buy
					if( ema1 > 567.46 )
						if( ema12 <= -7.83961 )
							if( ema1 <= 573.673 )
								ret := -0.600000
							if( ema1 > 573.673 )
								ret := -1.000000 // sell
						if( ema12 > -7.83961 )
							ret := 0.000000
				if( ema3 > 600.218 )
					if( ema13 <= -13.6691 )
						if( VIP_VIM <= -0.26742 )
							if( ema12 <= -15.3356 )
								ret := 0.250000
							if( ema12 > -15.3356 )
								if( ema13 <= -23.2284 )
									ret := 0.666667
								if( ema13 > -23.2284 )
									ret := 0.923913 // buy
						if( VIP_VIM > -0.26742 )
							ret := 0.000000
					if( ema13 > -13.6691 )
						if( ema3 <= 650.934 )
							if( tema <= 605.538 )
								ret := 0.500000
							if( tema > 605.538 )
								ret := -0.333333
						if( ema3 > 650.934 )
							ret := 1.000000 // buy
			if( VIP_VIM > -0.224105 )
				if( tema <= 586.565 )
					ret := 0.000000
				if( tema > 586.565 )
					if( ema12 <= -8.03487 )
						ret := -1.000000 // sell
					if( ema12 > -8.03487 )
						ret := -0.500000
		if( ema13 > -13.1933 )
			if( VIP_VIM <= -0.085838 )
				if( ema2 <= 632.85 )
					if( ema12 <= -2.75928 )
						if( tema <= 601.488 )
							if( tema <= 592.107 )
								if( ema13 <= -5.10655 )
									ret := 0.123810
								if( ema13 > -5.10655 )
									ret := -0.406250
							if( tema > 592.107 )
								if( ema13 <= -7.27074 )
									ret := -0.649123
								if( ema13 > -7.27074 )
									ret := -0.088235
						if( tema > 601.488 )
							if( ema2 <= 612.647 )
								ret := 1.000000 // buy
							if( ema2 > 612.647 )
								if( ema2 <= 615.529 )
									ret := -0.764706 // sell
								if( ema2 > 615.529 )
									ret := 0.430233
					if( ema12 > -2.75928 )
						if( ema3 <= 579.36 )
							if( ema2 <= 578.13 )
								if( ema2 <= 576.657 )
									ret := 0.571429
								if( ema2 > 576.657 )
									ret := -0.393443
							if( ema2 > 578.13 )
								if( ema3 <= 578.921 )
									ret := -0.978261 // sell
								if( ema3 > 578.921 )
									ret := -0.607143
						if( ema3 > 579.36 )
							if( ema13 <= -5.49958 )
								if( ema13 <= -7.51184 )
									ret := 0.200000
								if( ema13 > -7.51184 )
									ret := -0.777778 // sell
							if( ema13 > -5.49958 )
								if( ema3 <= 631.64 )
									ret := -0.110663
								if( ema3 > 631.64 )
									ret := 0.916667 // buy
				if( ema2 > 632.85 )
					if( ema3 <= 684.974 )
						if( VIM <= 1.16314 )
							if( ema3 <= 643.907 )
								if( ema2 <= 640.938 )
									ret := -0.720930 // sell
								if( ema2 > 640.938 )
									ret := -0.965517 // sell
							if( ema3 > 643.907 )
								if( ema2 <= 647.699 )
									ret := -0.030000
								if( ema2 > 647.699 )
									ret := -0.679487
						if( VIM > 1.16314 )
							if( ema12 <= -0.249237 )
								if( ema13 <= -10.5455 )
									ret := 0.714286 // buy
								if( ema13 > -10.5455 )
									ret := -0.222222
							if( ema12 > -0.249237 )
								ret := 1.000000 // buy
					if( ema3 > 684.974 )
						if( ema13 <= -3.10478 )
							if( ema1 <= 697.047 )
								ret := 0.000000
							if( ema1 > 697.047 )
								ret := -1.000000 // sell
						if( ema13 > -3.10478 )
							if( VIP_VIM <= -0.160792 )
								if( VIP <= 0.878986 )
									ret := 0.333333
								if( VIP > 0.878986 )
									ret := 0.727273 // buy
							if( VIP_VIM > -0.160792 )
								if( VIM <= 1.03699 )
									ret := -0.750000 // sell
								if( VIM > 1.03699 )
									ret := 0.250000
			if( VIP_VIM > -0.085838 )
				if( ema13 <= -5.16589 )
					if( ema1 <= 616.844 )
						if( ema12 <= -3.77896 )
							ret := -1.000000 // sell
						if( ema12 > -3.77896 )
							ret := 0.200000
					if( ema1 > 616.844 )
						if( VIP_VIM <= -0.0553 )
							if( ema2 <= 625.057 )
								ret := 1.000000 // buy
							if( ema2 > 625.057 )
								ret := 0.750000 // buy
						if( VIP_VIM > -0.0553 )
							ret := 1.000000 // buy
				if( ema13 > -5.16589 )
					if( ema12 <= 7.54663 )
						if( ema12 <= 1.15906 )
							if( ema3 <= 579.453 )
								if( ema13 <= 1.13424 )
									ret := -0.479592
								if( ema13 > 1.13424 )
									ret := 0.000000
							if( ema3 > 579.453 )
								if( VIM <= 1.00342 )
									ret := 0.092742
								if( VIM > 1.00342 )
									ret := -0.077307
						if( ema12 > 1.15906 )
							if( VIM <= 0.781357 )
								if( tema <= 607.977 )
									ret := -0.174721
								if( tema > 607.977 )
									ret := 0.208092
							if( VIM > 0.781357 )
								if( ema1 <= 608.232 )
									ret := -0.042289
								if( ema1 > 608.232 )
									ret := -0.269231
					if( ema12 > 7.54663 )
						if( ema2 <= 603.334 )
							if( ema12 <= 7.98311 )
								if( ema12 <= 7.7583 )
									ret := -0.750000 // sell
								if( ema12 > 7.7583 )
									ret := 0.000000
							if( ema12 > 7.98311 )
								if( ema13 <= 13.4849 )
									ret := -0.750000 // sell
								if( ema13 > 13.4849 )
									ret := -1.000000 // sell
						if( ema2 > 603.334 )
							if( ema12 <= 10.0416 )
								if( ema3 <= 646.731 )
									ret := -0.150000
								if( ema3 > 646.731 )
									ret := -0.538462
							if( ema12 > 10.0416 )
								ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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



//CODE associated with the technical indicator L_Vortex_Indicator 
//@version=5
//indicator title = "Vortex Indicator", shorttitle="VI", format=format.price, precision=4, timeframe="", timeframe_gaps=true)
period_ = input.int(14, title="Length", minval=2)
VMP = math.sum( math.abs( high - low[1]), period_ )
VMM = math.sum( math.abs( low - high[1]), period_ )
STR = math.sum( ta.atr(1), period_ )
VIP = VMP / STR
VIM = VMM / STR

VIP_VIM = VIP - VIM

plot(VIP, title="VI +", color=#2962FF)
plot(VIM, title="VI -", color=#E91E63)
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
float op_operation = decision_tree_0_BNBUSDT_30Min_83d70315(ema3, tema, ema2, ema12, ema13, ema1, VIP, VIM, VIP_VIM)

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


