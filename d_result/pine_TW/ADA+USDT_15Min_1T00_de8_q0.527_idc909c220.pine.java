//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: ADAUSDT_15Min_1T00_c909c220 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADAUSDT_15Min_1T00_c909c220", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADAUSDT_15Min_c909c220(ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ema2 <= 0.388 )
		if( ema12 <= -0.001139 )
			if( ema3 <= 0.288526 )
				if( ema12 <= -0.001396 )
					if( ema12 <= -0.002103 )
						if( ema13 <= -0.018579 )
							ret := -0.500000
						if( ema13 > -0.018579 )
							if( ema12 <= -0.006472 )
								if( ema1 <= 0.261307 )
									ret := 1.000000 // buy
								if( ema1 > 0.261307 )
									ret := 0.909091 // buy
							if( ema12 > -0.006472 )
								if( ema3 <= 0.271246 )
									ret := 0.637931
								if( ema3 > 0.271246 )
									ret := 0.361446
					if( ema12 > -0.002103 )
						if( ema2 <= 0.271423 )
							if( ema1 <= 0.259469 )
								if( tema <= 0.250723 )
									ret := 0.700000 // buy
								if( tema > 0.250723 )
									ret := -0.134615
							if( ema1 > 0.259469 )
								if( ema1 <= 0.269044 )
									ret := 0.500000
								if( ema1 > 0.269044 )
									ret := 0.866667 // buy
						if( ema2 > 0.271423 )
							if( ema3 <= 0.273409 )
								if( ema1 <= 0.270211 )
									ret := -1.000000 // sell
								if( ema1 > 0.270211 )
									ret := -0.700000 // sell
							if( ema3 > 0.273409 )
								if( ema1 <= 0.278655 )
									ret := 0.521739
								if( ema1 > 0.278655 )
									ret := 0.178571
				if( ema12 > -0.001396 )
					if( ema13 <= -0.002298 )
						if( ema13 <= -0.002862 )
							ret := 0.800000 // buy
						if( ema13 > -0.002862 )
							if( ema12 <= -0.001313 )
								if( ema1 <= 0.2662 )
									ret := 0.909091 // buy
								if( ema1 > 0.2662 )
									ret := 0.181818
							if( ema12 > -0.001313 )
								ret := -0.117647
					if( ema13 > -0.002298 )
						if( ema12 <= -0.001339 )
							if( ema13 <= -0.002156 )
								ret := 0.857143 // buy
							if( ema13 > -0.002156 )
								ret := 1.000000 // buy
						if( ema12 > -0.001339 )
							if( ema2 <= 0.280197 )
								if( ema1 <= 0.263209 )
									ret := 0.621951
								if( ema1 > 0.263209 )
									ret := 0.000000
							if( ema2 > 0.280197 )
								if( ema3 <= 0.283389 )
									ret := 0.913043 // buy
								if( ema3 > 0.283389 )
									ret := 0.750000 // buy
			if( ema3 > 0.288526 )
				if( ema3 <= 0.388058 )
					if( ema12 <= -0.005187 )
						if( ema3 <= 0.380822 )
							if( tema <= 0.354148 )
								if( ema2 <= 0.357729 )
									ret := 0.233871
								if( ema2 > 0.357729 )
									ret := 0.666667
							if( tema > 0.354148 )
								if( ema1 <= 0.365033 )
									ret := -0.684211
								if( ema1 > 0.365033 )
									ret := 0.208333
						if( ema3 > 0.380822 )
							if( ema2 <= 0.379301 )
								ret := 1.000000 // buy
							if( ema2 > 0.379301 )
								ret := 0.727273 // buy
					if( ema12 > -0.005187 )
						if( ema1 <= 0.28754 )
							if( ema1 <= 0.285872 )
								ret := 0.608696
							if( ema1 > 0.285872 )
								if( ema13 <= -0.005037 )
									ret := -1.000000 // sell
								if( ema13 > -0.005037 )
									ret := -0.453125
						if( ema1 > 0.28754 )
							if( ema1 <= 0.326651 )
								if( ema2 <= 0.316119 )
									ret := 0.141384
								if( ema2 > 0.316119 )
									ret := 0.375618
							if( ema1 > 0.326651 )
								if( ema3 <= 0.332895 )
									ret := 0.604651
								if( ema3 > 0.332895 )
									ret := 0.094118
				if( ema3 > 0.388058 )
					if( ema13 <= -0.002625 )
						if( ema13 <= -0.006029 )
							if( ema3 <= 0.39128 )
								if( tema <= 0.376062 )
									ret := 1.000000 // buy
								if( tema > 0.376062 )
									ret := 0.846154 // buy
							if( ema3 > 0.39128 )
								ret := 0.842105 // buy
						if( ema13 > -0.006029 )
							if( ema3 <= 0.388575 )
								if( tema <= 0.383552 )
									ret := 0.733333 // buy
								if( tema > 0.383552 )
									ret := 1.000000 // buy
							if( ema3 > 0.388575 )
								if( ema3 <= 0.389581 )
									ret := 0.200000
								if( ema3 > 0.389581 )
									ret := 0.809524 // buy
					if( ema13 > -0.002625 )
						if( ema2 <= 0.387733 )
							ret := -0.111111
						if( ema2 > 0.387733 )
							ret := 0.300000
		if( ema12 > -0.001139 )
			if( ema13 <= 0.000299 )
				if( ema1 <= 0.243952 )
					if( ema13 <= -0.00142 )
						if( tema <= 0.241013 )
							ret := 0.250000
						if( tema > 0.241013 )
							if( ema2 <= 0.243195 )
								ret := 1.000000 // buy
							if( ema2 > 0.243195 )
								ret := 0.333333
					if( ema13 > -0.00142 )
						if( ema3 <= 0.241549 )
							if( ema3 <= 0.24111 )
								ret := 0.300000
							if( ema3 > 0.24111 )
								ret := 1.000000 // buy
						if( ema3 > 0.241549 )
							if( ema1 <= 0.243283 )
								if( ema1 <= 0.242931 )
									ret := 0.000000
								if( ema1 > 0.242931 )
									ret := -0.333333
							if( ema1 > 0.243283 )
								if( ema1 <= 0.243544 )
									ret := 0.857143 // buy
								if( ema1 > 0.243544 )
									ret := 0.184211
				if( ema1 > 0.243952 )
					if( ema3 <= 0.253514 )
						if( ema13 <= -0.000568 )
							if( ema3 <= 0.247226 )
								if( ema3 <= 0.246697 )
									ret := 0.000000
								if( ema3 > 0.246697 )
									ret := 0.375000
							if( ema3 > 0.247226 )
								if( ema12 <= -0.000269 )
									ret := -0.278515
								if( ema12 > -0.000269 )
									ret := -0.600000
						if( ema13 > -0.000568 )
							if( tema <= 0.252951 )
								if( ema13 <= -8.2e-05 )
									ret := 0.066754
								if( ema13 > -8.2e-05 )
									ret := -0.177136
							if( tema > 0.252951 )
								if( ema2 <= 0.253414 )
									ret := -0.200000
								if( ema2 > 0.253414 )
									ret := -0.772727 // sell
					if( ema3 > 0.253514 )
						if( ema1 <= 0.255025 )
							if( ema2 <= 0.253524 )
								if( tema <= 0.251985 )
									ret := 0.000000
								if( tema > 0.251985 )
									ret := 0.677966
							if( ema2 > 0.253524 )
								if( tema <= 0.255305 )
									ret := 0.170635
								if( tema > 0.255305 )
									ret := 1.000000 // buy
						if( ema1 > 0.255025 )
							if( ema12 <= -0.000124 )
								if( ema12 <= -0.000682 )
									ret := 0.010433
								if( ema12 > -0.000682 )
									ret := -0.061337
							if( ema12 > -0.000124 )
								if( ema12 <= 0.000207 )
									ret := 0.037498
								if( ema12 > 0.000207 )
									ret := -0.103419
			if( ema13 > 0.000299 )
				if( ema2 <= 0.381417 )
					if( ema12 <= 0.00746 )
						if( ema3 <= 0.380584 )
							if( ema1 <= 0.380974 )
								if( ema3 <= 0.258418 )
									ret := 0.096154
								if( ema3 > 0.258418 )
									ret := 0.010667
							if( ema1 > 0.380974 )
								if( ema1 <= 0.3832 )
									ret := 0.444444
								if( ema1 > 0.3832 )
									ret := -0.259259
						if( ema3 > 0.380584 )
							if( tema <= 0.381579 )
								ret := 0.000000
							if( tema > 0.381579 )
								if( tema <= 0.382091 )
									ret := -0.925926 // sell
								if( tema > 0.382091 )
									ret := -0.413043
					if( ema12 > 0.00746 )
						if( ema3 <= 0.300442 )
							ret := 1.000000 // buy
						if( ema3 > 0.300442 )
							if( ema1 <= 0.334548 )
								ret := 0.333333
							if( ema1 > 0.334548 )
								ret := -0.421053
				if( ema2 > 0.381417 )
					if( tema <= 0.384371 )
						if( ema13 <= 0.000591 )
							if( ema12 <= 0.000366 )
								if( ema12 <= 0.000244 )
									ret := 0.057143
								if( ema12 > 0.000244 )
									ret := -0.444444
							if( ema12 > 0.000366 )
								ret := 0.750000 // buy
						if( ema13 > 0.000591 )
							if( ema12 <= 0.000864 )
								if( ema1 <= 0.382051 )
									ret := -0.071429
								if( ema1 > 0.382051 )
									ret := 0.696682
							if( ema12 > 0.000864 )
								ret := -0.363636
					if( tema > 0.384371 )
						if( tema <= 0.38573 )
							if( ema1 <= 0.385683 )
								if( ema2 <= 0.38443 )
									ret := -0.387097
								if( ema2 > 0.38443 )
									ret := -0.826923 // sell
							if( ema1 > 0.385683 )
								if( ema2 <= 0.386231 )
									ret := 0.000000
								if( ema2 > 0.386231 )
									ret := 0.444444
						if( tema > 0.38573 )
							if( ema12 <= 0.004247 )
								if( ema12 <= 0.003397 )
									ret := 0.171053
								if( ema12 > 0.003397 )
									ret := -0.885714 // sell
							if( ema12 > 0.004247 )
								if( ema2 <= 0.386038 )
									ret := 0.916667 // buy
								if( ema2 > 0.386038 )
									ret := 0.375000
	if( ema2 > 0.388 )
		if( ema12 <= -0.001156 )
			if( ema3 <= 0.784395 )
				if( ema13 <= -0.038777 )
					ret := 1.000000 // buy
				if( ema13 > -0.038777 )
					if( ema13 <= -0.000759 )
						if( ema1 <= 0.471918 )
							if( ema1 <= 0.398858 )
								if( ema1 <= 0.389629 )
									ret := 0.196774
								if( ema1 > 0.389629 )
									ret := -0.234982
							if( ema1 > 0.398858 )
								if( ema13 <= -0.011548 )
									ret := 0.691630
								if( ema13 > -0.011548 )
									ret := 0.160486
						if( ema1 > 0.471918 )
							if( ema1 <= 0.509769 )
								if( ema13 <= -0.00471 )
									ret := -0.015666
								if( ema13 > -0.00471 )
									ret := -0.203226
							if( ema1 > 0.509769 )
								if( ema13 <= -0.017422 )
									ret := -0.194631
								if( ema13 > -0.017422 )
									ret := 0.122110
					if( ema13 > -0.000759 )
						if( ema1 <= 0.598501 )
							if( ema13 <= -6.6e-05 )
								if( tema <= 0.478293 )
									ret := 0.181818
								if( tema > 0.478293 )
									ret := -0.238095
							if( ema13 > -6.6e-05 )
								ret := -0.607143
						if( ema1 > 0.598501 )
							if( ema2 <= 0.65785 )
								if( ema1 <= 0.64343 )
									ret := -0.642857
								if( ema1 > 0.64343 )
									ret := -1.000000 // sell
							if( ema2 > 0.65785 )
								if( tema <= 0.697778 )
									ret := -0.300000
								if( tema > 0.697778 )
									ret := -0.818182 // sell
			if( ema3 > 0.784395 )
				if( ema1 <= 0.785082 )
					if( ema13 <= -0.006128 )
						if( ema1 <= 0.776906 )
							ret := -1.000000 // sell
						if( ema1 > 0.776906 )
							ret := 0.636364
					if( ema13 > -0.006128 )
						if( tema <= 0.780451 )
							if( ema1 <= 0.781322 )
								ret := -0.833333 // sell
							if( ema1 > 0.781322 )
								ret := -1.000000 // sell
						if( tema > 0.780451 )
							if( ema13 <= -0.004273 )
								ret := -1.000000 // sell
							if( ema13 > -0.004273 )
								ret := -0.687500
				if( ema1 > 0.785082 )
					if( ema12 <= -0.002663 )
						if( ema1 <= 0.841078 )
							if( ema3 <= 0.790135 )
								ret := -1.000000 // sell
							if( ema3 > 0.790135 )
								if( tema <= 0.826469 )
									ret := 0.201550
								if( tema > 0.826469 )
									ret := 0.952381 // buy
						if( ema1 > 0.841078 )
							if( ema1 <= 0.865626 )
								ret := -1.000000 // sell
							if( ema1 > 0.865626 )
								if( ema2 <= 0.877346 )
									ret := 1.000000 // buy
								if( ema2 > 0.877346 )
									ret := -0.722222 // sell
					if( ema12 > -0.002663 )
						if( ema3 <= 0.836169 )
							if( ema1 <= 0.789393 )
								if( tema <= 0.782281 )
									ret := -1.000000 // sell
								if( tema > 0.782281 )
									ret := 0.375000
							if( ema1 > 0.789393 )
								if( ema2 <= 0.811542 )
									ret := -0.754098 // sell
								if( ema2 > 0.811542 )
									ret := -0.450000
						if( ema3 > 0.836169 )
							if( tema <= 0.836351 )
								if( ema3 <= 0.840854 )
									ret := 0.880000 // buy
								if( ema3 > 0.840854 )
									ret := 0.555556
							if( tema > 0.836351 )
								if( ema12 <= -0.002184 )
									ret := -1.000000 // sell
								if( ema12 > -0.002184 )
									ret := -0.428571
		if( ema12 > -0.001156 )
			if( ema13 <= 0.01003 )
				if( ema12 <= 0.003015 )
					if( ema1 <= 0.844843 )
						if( tema <= 0.394033 )
							if( ema1 <= 0.390636 )
								if( ema1 <= 0.388816 )
									ret := -0.395349
								if( ema1 > 0.388816 )
									ret := 0.056410
							if( ema1 > 0.390636 )
								if( ema2 <= 0.392991 )
									ret := -0.242678
								if( ema2 > 0.392991 )
									ret := -0.465565
						if( tema > 0.394033 )
							if( ema1 <= 0.820451 )
								if( ema2 <= 0.61842 )
									ret := -0.025036
								if( ema2 > 0.61842 )
									ret := -0.132231
							if( ema1 > 0.820451 )
								if( tema <= 0.840633 )
									ret := 0.560606
								if( tema > 0.840633 )
									ret := -0.093750
					if( ema1 > 0.844843 )
						if( ema12 <= -0.000281 )
							ret := -0.444444
						if( ema12 > -0.000281 )
							if( ema12 <= 0.000911 )
								if( ema1 <= 0.847989 )
									ret := -0.916667 // sell
								if( ema1 > 0.847989 )
									ret := -1.000000 // sell
							if( ema12 > 0.000911 )
								if( ema13 <= 0.004245 )
									ret := -0.823529 // sell
								if( ema13 > 0.004245 )
									ret := -0.631579
				if( ema12 > 0.003015 )
					if( ema2 <= 0.535044 )
						if( tema <= 0.532925 )
							if( ema1 <= 0.42589 )
								if( ema13 <= 0.008632 )
									ret := -0.549223
								if( ema13 > 0.008632 )
									ret := -0.888889 // sell
							if( ema1 > 0.42589 )
								if( ema2 <= 0.435111 )
									ret := 0.649351
								if( ema2 > 0.435111 )
									ret := -0.212286
						if( tema > 0.532925 )
							if( tema <= 0.53716 )
								if( ema1 <= 0.532298 )
									ret := -0.726027 // sell
								if( ema1 > 0.532298 )
									ret := -0.047619
							if( tema > 0.53716 )
								if( tema <= 0.538964 )
									ret := -0.818182 // sell
								if( tema > 0.538964 )
									ret := -0.987654 // sell
					if( ema2 > 0.535044 )
						if( tema <= 0.598799 )
							if( ema12 <= 0.004785 )
								if( ema3 <= 0.537861 )
									ret := 0.867925 // buy
								if( ema3 > 0.537861 )
									ret := 0.068558
							if( ema12 > 0.004785 )
								if( ema2 <= 0.550448 )
									ret := 0.153846
								if( ema2 > 0.550448 )
									ret := 0.876543 // buy
						if( tema > 0.598799 )
							if( ema1 <= 0.593508 )
								ret := 0.875000 // buy
							if( ema1 > 0.593508 )
								if( ema2 <= 0.642386 )
									ret := -0.311445
								if( ema2 > 0.642386 )
									ret := -0.069204
			if( ema13 > 0.01003 )
				if( ema1 <= 0.470765 )
					if( ema12 <= 0.00561 )
						ret := 0.727273 // buy
					if( ema12 > 0.00561 )
						if( ema12 <= 0.007241 )
							if( ema1 <= 0.462821 )
								if( ema1 <= 0.404483 )
									ret := -0.846154 // sell
								if( ema1 > 0.404483 )
									ret := -0.150000
							if( ema1 > 0.462821 )
								ret := -0.863636 // sell
						if( ema12 > 0.007241 )
							ret := -1.000000 // sell
				if( ema1 > 0.470765 )
					if( ema1 <= 0.493053 )
						if( ema3 <= 0.478851 )
							if( ema2 <= 0.479915 )
								if( tema <= 0.49395 )
									ret := 0.724138 // buy
								if( tema > 0.49395 )
									ret := 1.000000 // buy
							if( ema2 > 0.479915 )
								if( ema1 <= 0.488229 )
									ret := -0.777778 // sell
								if( ema1 > 0.488229 )
									ret := 0.416667
						if( ema3 > 0.478851 )
							ret := 1.000000 // buy
					if( ema1 > 0.493053 )
						if( ema2 <= 0.488383 )
							if( ema3 <= 0.47977 )
								if( tema <= 0.508043 )
									ret := -0.875000 // sell
								if( tema > 0.508043 )
									ret := -1.000000 // sell
							if( ema3 > 0.47977 )
								ret := -0.727273 // sell
						if( ema2 > 0.488383 )
							if( ema3 <= 0.783453 )
								if( ema2 <= 0.781498 )
									ret := 0.206748
								if( ema2 > 0.781498 )
									ret := -0.909091 // sell
							if( ema3 > 0.783453 )
								if( ema1 <= 0.894918 )
									ret := 0.884211 // buy
								if( ema1 > 0.894918 )
									ret := -0.846154 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_ADAUSDT_15Min_c909c220(ema3, tema, ema2, ema12, ema13, ema1)

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


