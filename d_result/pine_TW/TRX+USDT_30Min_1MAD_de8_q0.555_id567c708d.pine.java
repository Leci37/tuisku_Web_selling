//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Madrid_Moving_Average_Ribbon
// ID_model: TRXUSDT_30Min_1MAD_567c708d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TRXUSDT_30Min_1MAD_567c708d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TRXUSDT_30Min_567c708d(ma05, ma50_colorInt, ma90, ma35_colorInt, ma90_colorInt, ma55_colorInt, ma20, ma15_colorInt, ma40_colorInt, ma45_colorInt, ma65_colorInt, ma75_colorInt, ma35, ma30, ma60, ma75, ma05_colorInt, ma45, ma40, ma30_colorInt, ma25, ma100, ma50, ma70_colorInt, ma10_colorInt, ma20_colorInt, ma60_colorInt, ma25_colorInt, ma10, ma15, ma80, ma65, ma85_colorInt, ma55, ma70, ma85, ma80_colorInt)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=0.7, min_samples_leaf=7,min_samples_split=10, random_state=843828734)
	if( ma05 <= 0.064893 )
		if( ma60_colorInt <= 3.5 )
			if( ma10 <= 0.064841 )
				if( ma10_colorInt <= 2.5 )
					if( ma60 <= 0.028375 )
						if( ma65 <= 0.027863 )
							if( ma05_colorInt <= 2.5 )
								if( ma50 <= 0.025057 )
									ret := 0.666667
								if( ma50 > 0.025057 )
									ret := 0.012593
							if( ma05_colorInt > 2.5 )
								if( ma55 <= 0.026977 )
									ret := -0.088889
								if( ma55 > 0.026977 )
									ret := -0.962264 // sell
						if( ma65 > 0.027863 )
							if( ma75_colorInt <= 3.5 )
								if( ma25_colorInt <= 1.5 )
									ret := -0.900000 // sell
								if( ma25_colorInt > 1.5 )
									ret := -0.414634
							if( ma75_colorInt > 3.5 )
								ret := 0.461538
					if( ma60 > 0.028375 )
						if( ma25 <= 0.028835 )
							if( ma85 <= 0.028411 )
								if( ma70 <= 0.028393 )
									ret := 0.600000
								if( ma70 > 0.028393 )
									ret := 0.965517 // buy
							if( ma85 > 0.028411 )
								ret := -0.100000
						if( ma25 > 0.028835 )
							if( ma10 <= 0.064705 )
								if( ma10 <= 0.030147 )
									ret := 0.251177
								if( ma10 > 0.030147 )
									ret := 0.091631
							if( ma10 > 0.064705 )
								if( ma15 <= 0.064764 )
									ret := -0.506329
								if( ma15 > 0.064764 )
									ret := 0.185185
				if( ma10_colorInt > 2.5 )
					if( ma65 <= 0.061489 )
						if( ma85 <= 0.061548 )
							if( ma35 <= 0.05827 )
								if( ma45 <= 0.053798 )
									ret := 0.171899
								if( ma45 > 0.053798 )
									ret := 0.031462
							if( ma35 > 0.05827 )
								if( ma05_colorInt <= 3.5 )
									ret := 0.359149
								if( ma05_colorInt > 3.5 )
									ret := 0.121921
						if( ma85 > 0.061548 )
							if( ma10_colorInt <= 3.5 )
								if( ma05 <= 0.056463 )
									ret := 1.000000 // buy
								if( ma05 > 0.056463 )
									ret := 0.894737 // buy
							if( ma10_colorInt > 3.5 )
								if( ma65 <= 0.061224 )
									ret := -0.500000
								if( ma65 > 0.061224 )
									ret := 0.850000 // buy
					if( ma65 > 0.061489 )
						if( ma15 <= 0.059644 )
							if( ma25 <= 0.058965 )
								ret := 0.692308
							if( ma25 > 0.058965 )
								if( ma15 <= 0.05943 )
									ret := -1.000000 // sell
								if( ma15 > 0.05943 )
									ret := -0.600000
						if( ma15 > 0.059644 )
							if( ma05 <= 0.060116 )
								if( ma75 <= 0.064569 )
									ret := 0.204819
								if( ma75 > 0.064569 )
									ret := 0.875000 // buy
							if( ma05 > 0.060116 )
								if( ma45 <= 0.06607 )
									ret := 0.082088
								if( ma45 > 0.06607 )
									ret := -0.357143
			if( ma10 > 0.064841 )
				if( ma20 <= 0.065738 )
					if( ma40 <= 0.066389 )
						if( ma100 <= 0.063646 )
							ret := -0.300000
						if( ma100 > 0.063646 )
							if( ma30 <= 0.065303 )
								if( ma20 <= 0.064868 )
									ret := 0.263158
								if( ma20 > 0.064868 )
									ret := 0.757895 // buy
							if( ma30 > 0.065303 )
								if( ma55 <= 0.065771 )
									ret := -0.473684
								if( ma55 > 0.065771 )
									ret := 0.697674
					if( ma40 > 0.066389 )
						ret := -0.555556
				if( ma20 > 0.065738 )
					if( ma70 <= 0.069262 )
						if( ma25 <= 0.06637 )
							ret := 0.923077 // buy
						if( ma25 > 0.06637 )
							ret := 1.000000 // buy
					if( ma70 > 0.069262 )
						ret := 0.769231 // buy
		if( ma60_colorInt > 3.5 )
			if( ma05 <= 0.064265 )
				if( ma80_colorInt <= 1.5 )
					if( ma70_colorInt <= 3.5 )
						if( ma10_colorInt <= 1.5 )
							ret := 0.000000
						if( ma10_colorInt > 1.5 )
							ret := -0.312500
					if( ma70_colorInt > 3.5 )
						if( ma05 <= 0.025815 )
							ret := -0.062500
						if( ma05 > 0.025815 )
							if( ma50 <= 0.057736 )
								if( ma30 <= 0.030485 )
									ret := 0.787879 // buy
								if( ma30 > 0.030485 )
									ret := 1.000000 // buy
							if( ma50 > 0.057736 )
								if( ma85 <= 0.059895 )
									ret := 0.181818
								if( ma85 > 0.059895 )
									ret := 0.555556
				if( ma80_colorInt > 1.5 )
					if( ma05_colorInt <= 1.5 )
						if( ma15 <= 0.058211 )
							if( ma25 <= 0.056213 )
								if( ma10 <= 0.055804 )
									ret := -0.156342
								if( ma10 > 0.055804 )
									ret := 0.711538 // buy
							if( ma25 > 0.056213 )
								if( ma75 <= 0.057591 )
									ret := -0.847222 // sell
								if( ma75 > 0.057591 )
									ret := 0.222222
						if( ma15 > 0.058211 )
							if( ma15 <= 0.06141 )
								if( ma20 <= 0.06008 )
									ret := 0.077236
								if( ma20 > 0.06008 )
									ret := 0.432258
							if( ma15 > 0.06141 )
								if( ma50 <= 0.061223 )
									ret := -0.611111
								if( ma50 > 0.061223 )
									ret := -0.046753
					if( ma05_colorInt > 1.5 )
						if( ma100 <= 0.028734 )
							if( ma90 <= 0.027003 )
								if( ma90 <= 0.026938 )
									ret := 0.175084
								if( ma90 > 0.026938 )
									ret := -0.666667
							if( ma90 > 0.027003 )
								if( ma25_colorInt <= 2 )
									ret := 0.909091 // buy
								if( ma25_colorInt > 2 )
									ret := 0.292929
						if( ma100 > 0.028734 )
							if( ma75 <= 0.059962 )
								if( ma30 <= 0.059321 )
									ret := -0.007812
								if( ma30 > 0.059321 )
									ret := -0.366667
							if( ma75 > 0.059962 )
								if( ma30 <= 0.061212 )
									ret := 0.418994
								if( ma30 > 0.061212 )
									ret := 0.001541
			if( ma05 > 0.064265 )
				if( ma35 <= 0.064434 )
					if( ma85 <= 0.06416 )
						if( ma40 <= 0.063687 )
							ret := 0.894737 // buy
						if( ma40 > 0.063687 )
							if( ma60 <= 0.063954 )
								ret := -0.800000 // sell
							if( ma60 > 0.063954 )
								ret := 0.071429
					if( ma85 > 0.06416 )
						if( ma85 <= 0.064495 )
							if( ma90 <= 0.064392 )
								if( ma70 <= 0.06417 )
									ret := 1.000000 // buy
								if( ma70 > 0.06417 )
									ret := 0.222222
							if( ma90 > 0.064392 )
								if( ma100 <= 0.064547 )
									ret := 1.000000 // buy
								if( ma100 > 0.064547 )
									ret := 0.923077 // buy
						if( ma85 > 0.064495 )
							if( ma25 <= 0.064092 )
								ret := 0.941176 // buy
							if( ma25 > 0.064092 )
								if( ma30 <= 0.064404 )
									ret := 0.088235
								if( ma30 > 0.064404 )
									ret := 0.900000 // buy
				if( ma35 > 0.064434 )
					if( ma75 <= 0.064745 )
						ret := -0.647059
					if( ma75 > 0.064745 )
						if( ma55 <= 0.064734 )
							ret := 0.111111
						if( ma55 > 0.064734 )
							ret := -0.461538
	if( ma05 > 0.064893 )
		if( ma85 <= 0.064378 )
			if( ma15_colorInt <= 1.5 )
				if( ma25 <= 0.063946 )
					if( ma05 <= 0.06547 )
						if( ma100 <= 0.062021 )
							ret := -1.000000 // sell
						if( ma100 > 0.062021 )
							if( ma50 <= 0.063159 )
								ret := 0.800000 // buy
							if( ma50 > 0.063159 )
								ret := -0.230769
					if( ma05 > 0.06547 )
						if( ma75 <= 0.060402 )
							ret := 0.444444
						if( ma75 > 0.060402 )
							ret := 1.000000 // buy
				if( ma25 > 0.063946 )
					if( ma05 <= 0.06549 )
						if( ma05 <= 0.065435 )
							if( ma60 <= 0.064434 )
								if( ma10 <= 0.065148 )
									ret := -0.496124
								if( ma10 > 0.065148 )
									ret := -0.952381 // sell
							if( ma60 > 0.064434 )
								if( ma70 <= 0.064427 )
									ret := 0.090909
								if( ma70 > 0.064427 )
									ret := -0.307692
						if( ma05 > 0.065435 )
							ret := 0.368421
					if( ma05 > 0.06549 )
						if( ma35 <= 0.06481 )
							if( ma05 <= 0.066498 )
								if( ma10 <= 0.065426 )
									ret := -0.896552 // sell
								if( ma10 > 0.065426 )
									ret := -0.571429
							if( ma05 > 0.066498 )
								ret := -1.000000 // sell
						if( ma35 > 0.06481 )
							if( ma50 <= 0.064444 )
								ret := 0.272727
							if( ma50 > 0.064444 )
								if( ma75 <= 0.064349 )
									ret := -0.607143
								if( ma75 > 0.064349 )
									ret := -1.000000 // sell
			if( ma15_colorInt > 1.5 )
				if( ma20 <= 0.065095 )
					if( ma75 <= 0.06301 )
						ret := -1.000000 // sell
					if( ma75 > 0.06301 )
						if( ma90 <= 0.064075 )
							ret := 0.000000
						if( ma90 > 0.064075 )
							ret := -0.750000 // sell
				if( ma20 > 0.065095 )
					if( ma50 <= 0.06491 )
						if( ma25 <= 0.065344 )
							ret := 0.586207
						if( ma25 > 0.065344 )
							ret := 1.000000 // buy
					if( ma50 > 0.06491 )
						ret := -0.181818
		if( ma85 > 0.064378 )
			if( ma55 <= 0.119355 )
				if( ma100 <= 0.085102 )
					if( ma10 <= 0.084414 )
						if( ma100 <= 0.065688 )
							if( ma05 <= 0.067006 )
								if( ma35_colorInt <= 3.5 )
									ret := 0.144550
								if( ma35_colorInt > 3.5 )
									ret := -0.089506
							if( ma05 > 0.067006 )
								if( ma35 <= 0.067009 )
									ret := 0.607407
								if( ma35 > 0.067009 )
									ret := -0.428571
						if( ma100 > 0.065688 )
							if( ma55 <= 0.06769 )
								if( ma100 <= 0.068429 )
									ret := -0.120680
								if( ma100 > 0.068429 )
									ret := 0.750000 // buy
							if( ma55 > 0.06769 )
								if( ma05 <= 0.067493 )
									ret := 0.336471
								if( ma05 > 0.067493 )
									ret := 0.032539
					if( ma10 > 0.084414 )
						if( ma40 <= 0.083514 )
							if( ma10 <= 0.084645 )
								if( ma35 <= 0.082828 )
									ret := -0.785714 // sell
								if( ma35 > 0.082828 )
									ret := -0.250000
							if( ma10 > 0.084645 )
								if( ma20 <= 0.084966 )
									ret := -0.939394 // sell
								if( ma20 > 0.084966 )
									ret := -0.638889
						if( ma40 > 0.083514 )
							if( ma05 <= 0.08918 )
								if( ma90 <= 0.080364 )
									ret := 0.476190
								if( ma90 > 0.080364 )
									ret := -0.262295
							if( ma05 > 0.08918 )
								ret := -1.000000 // sell
				if( ma100 > 0.085102 )
					if( ma90 <= 0.098374 )
						if( ma85 <= 0.095257 )
							if( ma10 <= 0.092874 )
								if( ma100 <= 0.092728 )
									ret := 0.072056
								if( ma100 > 0.092728 )
									ret := 0.305835
							if( ma10 > 0.092874 )
								if( ma100 <= 0.094852 )
									ret := -0.007407
								if( ma100 > 0.094852 )
									ret := -0.387097
						if( ma85 > 0.095257 )
							if( ma60 <= 0.096062 )
								if( ma10 <= 0.093146 )
									ret := 0.801170 // buy
								if( ma10 > 0.093146 )
									ret := 0.405941
							if( ma60 > 0.096062 )
								if( ma40 <= 0.09883 )
									ret := 0.086570
								if( ma40 > 0.09883 )
									ret := 0.520468
					if( ma90 > 0.098374 )
						if( ma90 <= 0.100179 )
							if( ma10_colorInt <= 1.5 )
								if( ma50 <= 0.100336 )
									ret := -0.351598
								if( ma50 > 0.100336 )
									ret := -0.742268 // sell
							if( ma10_colorInt > 1.5 )
								if( ma25_colorInt <= 2.5 )
									ret := 0.231076
								if( ma25_colorInt > 2.5 )
									ret := -0.200000
						if( ma90 > 0.100179 )
							if( ma70 <= 0.101192 )
								if( ma55 <= 0.098685 )
									ret := -0.619048
								if( ma55 > 0.098685 )
									ret := 0.319475
							if( ma70 > 0.101192 )
								if( ma90 <= 0.103029 )
									ret := -0.132308
								if( ma90 > 0.103029 )
									ret := 0.046705
			if( ma55 > 0.119355 )
				if( ma20_colorInt <= 1.5 )
					if( ma100 <= 0.119662 )
						if( ma05 <= 0.121256 )
							if( ma40 <= 0.11975 )
								if( ma65 <= 0.119462 )
									ret := -0.054054
								if( ma65 > 0.119462 )
									ret := -0.690476
							if( ma40 > 0.11975 )
								if( ma15 <= 0.120262 )
									ret := -0.037037
								if( ma15 > 0.120262 )
									ret := 0.170732
						if( ma05 > 0.121256 )
							if( ma65 <= 0.119935 )
								if( ma55 <= 0.11979 )
									ret := -0.346154
								if( ma55 > 0.11979 )
									ret := -0.932203 // sell
							if( ma65 > 0.119935 )
								if( ma05 <= 0.134776 )
									ret := -0.138889
								if( ma05 > 0.134776 )
									ret := -1.000000 // sell
					if( ma100 > 0.119662 )
						if( ma100 <= 0.128445 )
							if( ma70 <= 0.128945 )
								if( ma100 <= 0.125737 )
									ret := 0.087986
								if( ma100 > 0.125737 )
									ret := -0.107914
							if( ma70 > 0.128945 )
								ret := -1.000000 // sell
						if( ma100 > 0.128445 )
							if( ma05 <= 0.148909 )
								if( ma30 <= 0.140502 )
									ret := 0.177849
								if( ma30 > 0.140502 )
									ret := 0.479381
							if( ma05 > 0.148909 )
								if( ma85 <= 0.142153 )
									ret := -0.712500 // sell
								if( ma85 > 0.142153 )
									ret := 0.109980
				if( ma20_colorInt > 1.5 )
					if( ma30_colorInt <= 3.5 )
						if( ma90 <= 0.1321 )
							if( ma100 <= 0.128407 )
								if( ma50 <= 0.121058 )
									ret := -0.250460
								if( ma50 > 0.121058 )
									ret := -0.070848
							if( ma100 > 0.128407 )
								if( ma05 <= 0.123026 )
									ret := 0.244898
								if( ma05 > 0.123026 )
									ret := -0.420103
						if( ma90 > 0.1321 )
							if( ma15 <= 0.129876 )
								if( ma100 <= 0.138736 )
									ret := 0.833333 // buy
								if( ma100 > 0.138736 )
									ret := 0.250000
							if( ma15 > 0.129876 )
								if( ma05 <= 0.130523 )
									ret := -0.569231
								if( ma05 > 0.130523 )
									ret := -0.084034
					if( ma30_colorInt > 3.5 )
						if( ma05_colorInt <= 3.5 )
							if( ma30 <= 0.130435 )
								if( ma50_colorInt <= 3.5 )
									ret := 0.634921
								if( ma50_colorInt > 3.5 )
									ret := 0.228916
							if( ma30 > 0.130435 )
								if( ma10_colorInt <= 1.5 )
									ret := -0.119048
								if( ma10_colorInt > 1.5 )
									ret := 0.071895
						if( ma05_colorInt > 3.5 )
							if( ma90_colorInt <= 3.5 )
								if( ma20 <= 0.118746 )
									ret := -0.714286 // sell
								if( ma20 > 0.118746 )
									ret := 0.051437
							if( ma90_colorInt > 3.5 )
								if( ma05 <= 0.14603 )
									ret := -0.324675
								if( ma05 > 0.14603 )
									ret := 0.256410
	
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
float op_operation = decision_tree_0_TRXUSDT_30Min_567c708d(ma05, ma50_colorInt, ma90, ma35_colorInt, ma90_colorInt, ma55_colorInt, ma20, ma15_colorInt, ma40_colorInt, ma45_colorInt, ma65_colorInt, ma75_colorInt, ma35, ma30, ma60, ma75, ma05_colorInt, ma45, ma40, ma30_colorInt, ma25, ma100, ma50, ma70_colorInt, ma10_colorInt, ma20_colorInt, ma60_colorInt, ma25_colorInt, ma10, ma15, ma80, ma65, ma85_colorInt, ma55, ma70, ma85, ma80_colorInt)

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


