//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: ADAUSDT_5Min_2TV0_b01e92c8 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADAUSDT_5Min_2TV0_b01e92c8", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADAUSDT_5Min_b01e92c8(ema3, tema, ema2, ema12, ema13, ema1, VIP, VIM, VIP_VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( VIP <= 0.657882 )
		if( VIM <= 1.30752 )
			if( ema3 <= 0.383944 )
				if( ema12 <= -0.003131 )
					if( ema12 <= -0.004065 )
						ret := 1.000000 // buy
					if( ema12 > -0.004065 )
						ret := 0.700000 // buy
				if( ema12 > -0.003131 )
					if( tema <= 0.312045 )
						if( VIM <= 1.20907 )
							if( ema13 <= -0.000776 )
								if( VIP_VIM <= -0.669024 )
									ret := 0.538462
								if( VIP_VIM > -0.669024 )
									ret := 0.894737 // buy
							if( ema13 > -0.000776 )
								ret := 0.263158
						if( VIM > 1.20907 )
							if( ema2 <= 0.307242 )
								if( tema <= 0.244333 )
									ret := 0.875000 // buy
								if( tema > 0.244333 )
									ret := -0.140351
							if( ema2 > 0.307242 )
								ret := 1.000000 // buy
					if( tema > 0.312045 )
						if( VIP <= 0.615993 )
							if( ema1 <= 0.347729 )
								if( VIP_VIM <= -0.695755 )
									ret := -1.000000 // sell
								if( VIP_VIM > -0.695755 )
									ret := -0.888889 // sell
							if( ema1 > 0.347729 )
								ret := -0.266667
						if( VIP > 0.615993 )
							if( ema13 <= -0.002633 )
								if( VIP <= 0.631222 )
									ret := 0.400000
								if( VIP > 0.631222 )
									ret := -0.642857
							if( ema13 > -0.002633 )
								if( VIP <= 0.633641 )
									ret := 0.807692 // buy
								if( VIP > 0.633641 )
									ret := 0.016667
			if( ema3 > 0.383944 )
				if( ema12 <= -0.001269 )
					if( ema3 <= 0.392492 )
						if( ema13 <= -0.00307 )
							ret := 1.000000 // buy
						if( ema13 > -0.00307 )
							ret := -0.333333
					if( ema3 > 0.392492 )
						if( ema13 <= -0.01178 )
							if( ema1 <= 0.555644 )
								ret := -0.882353 // sell
							if( ema1 > 0.555644 )
								if( tema <= 0.718401 )
									ret := 0.500000
								if( tema > 0.718401 )
									ret := 1.000000 // buy
						if( ema13 > -0.01178 )
							if( ema1 <= 0.409853 )
								if( VIP_VIM <= -0.625193 )
									ret := 1.000000 // buy
								if( VIP_VIM > -0.625193 )
									ret := 0.777778 // buy
							if( ema1 > 0.409853 )
								if( VIP_VIM <= -0.767997 )
									ret := 0.948718 // buy
								if( VIP_VIM > -0.767997 )
									ret := 0.602612
				if( ema12 > -0.001269 )
					if( VIP_VIM <= -0.710431 )
						ret := 0.950000 // buy
					if( VIP_VIM > -0.710431 )
						if( ema12 <= -0.000984 )
							if( VIP_VIM <= -0.629493 )
								if( ema1 <= 0.465639 )
									ret := -0.777778 // sell
								if( ema1 > 0.465639 )
									ret := -0.200000
							if( VIP_VIM > -0.629493 )
								ret := -0.043478
						if( ema12 > -0.000984 )
							if( VIP_VIM <= -0.496227 )
								if( ema2 <= 0.465523 )
									ret := 0.142857
								if( ema2 > 0.465523 )
									ret := -0.500000
							if( VIP_VIM > -0.496227 )
								ret := 0.857143 // buy
		if( VIM > 1.30752 )
			if( ema3 <= 0.382446 )
				if( ema2 <= 0.356011 )
					if( ema13 <= -0.001401 )
						if( ema1 <= 0.328834 )
							if( VIP_VIM <= -0.743182 )
								if( ema1 <= 0.262239 )
									ret := 0.521739
								if( ema1 > 0.262239 )
									ret := 0.828358 // buy
							if( VIP_VIM > -0.743182 )
								if( ema12 <= -0.001661 )
									ret := 1.000000 // buy
								if( ema12 > -0.001661 )
									ret := -0.157895
						if( ema1 > 0.328834 )
							if( tema <= 0.336065 )
								if( VIP_VIM <= -0.682038 )
									ret := -0.454545
								if( VIP_VIM > -0.682038 )
									ret := 0.583333
							if( tema > 0.336065 )
								if( ema12 <= -0.001565 )
									ret := 0.714286 // buy
								if( ema12 > -0.001565 )
									ret := 0.328571
					if( ema13 > -0.001401 )
						if( tema <= 0.266872 )
							if( ema13 <= -0.000817 )
								if( ema12 <= -0.000605 )
									ret := -0.719298 // sell
								if( ema12 > -0.000605 )
									ret := -0.236842
							if( ema13 > -0.000817 )
								if( VIP_VIM <= -0.764558 )
									ret := -0.125000
								if( VIP_VIM > -0.764558 )
									ret := 0.035714
						if( tema > 0.266872 )
							if( ema2 <= 0.308192 )
								if( ema12 <= -0.000723 )
									ret := 0.818182 // buy
								if( ema12 > -0.000723 )
									ret := 0.064516
							if( ema2 > 0.308192 )
								if( VIP_VIM <= -0.719107 )
									ret := -0.613636
								if( VIP_VIM > -0.719107 )
									ret := 0.272727
				if( ema2 > 0.356011 )
					if( ema13 <= -0.007474 )
						ret := 1.000000 // buy
					if( ema13 > -0.007474 )
						if( VIM <= 1.33971 )
							if( tema <= 0.357304 )
								if( VIM <= 1.31622 )
									ret := -1.000000 // sell
								if( VIM > 1.31622 )
									ret := -0.333333
							if( tema > 0.357304 )
								ret := -1.000000 // sell
						if( VIM > 1.33971 )
							if( VIM <= 1.37942 )
								if( ema1 <= 0.360422 )
									ret := -0.388889
								if( ema1 > 0.360422 )
									ret := 0.243902
							if( VIM > 1.37942 )
								if( ema12 <= -0.003272 )
									ret := 0.125000
								if( ema12 > -0.003272 )
									ret := -0.748092 // sell
			if( ema3 > 0.382446 )
				if( tema <= 0.419861 )
					if( tema <= 0.391572 )
						if( VIP_VIM <= -0.719429 )
							if( VIP_VIM <= -0.818603 )
								if( ema13 <= -0.004658 )
									ret := 0.500000
								if( ema13 > -0.004658 )
									ret := -0.282051
							if( VIP_VIM > -0.818603 )
								if( ema1 <= 0.388529 )
									ret := 0.820000 // buy
								if( ema1 > 0.388529 )
									ret := 0.090909
						if( VIP_VIM > -0.719429 )
							if( VIP <= 0.640761 )
								if( ema2 <= 0.388193 )
									ret := -1.000000 // sell
								if( ema2 > 0.388193 )
									ret := -0.555556
							if( VIP > 0.640761 )
								if( ema1 <= 0.390232 )
									ret := 0.550000
								if( ema1 > 0.390232 )
									ret := -0.636364
					if( tema > 0.391572 )
						if( ema13 <= -0.004202 )
							if( tema <= 0.401702 )
								ret := -0.357143
							if( tema > 0.401702 )
								ret := 0.769231 // buy
						if( ema13 > -0.004202 )
							if( VIM <= 1.34313 )
								if( ema13 <= -0.002543 )
									ret := 0.761905 // buy
								if( ema13 > -0.002543 )
									ret := 0.125000
							if( VIM > 1.34313 )
								if( ema1 <= 0.407311 )
									ret := 0.934426 // buy
								if( ema1 > 0.407311 )
									ret := 0.657895
				if( tema > 0.419861 )
					if( ema13 <= -0.01597 )
						if( VIP <= 0.550179 )
							ret := 1.000000 // buy
						if( VIP > 0.550179 )
							ret := 0.823529 // buy
					if( ema13 > -0.01597 )
						if( VIP_VIM <= -0.977277 )
							if( ema3 <= 0.49863 )
								ret := -0.428571
							if( ema3 > 0.49863 )
								ret := -1.000000 // sell
						if( VIP_VIM > -0.977277 )
							if( ema3 <= 0.456181 )
								if( ema3 <= 0.439622 )
									ret := 0.230769
								if( ema3 > 0.439622 )
									ret := -0.314917
							if( ema3 > 0.456181 )
								if( VIP_VIM <= -0.924451 )
									ret := 0.852941 // buy
								if( VIP_VIM > -0.924451 )
									ret := 0.099291
	if( VIP > 0.657882 )
		if( ema12 <= -0.000476 )
			if( VIM <= 1.10734 )
				if( VIP_VIM <= -0.248225 )
					if( ema1 <= 0.353185 )
						if( ema12 <= -0.0006 )
							if( VIP_VIM <= -0.29596 )
								if( VIP_VIM <= -0.319817 )
									ret := 0.642857
								if( VIP_VIM > -0.319817 )
									ret := 1.000000 // buy
							if( VIP_VIM > -0.29596 )
								if( VIP_VIM <= -0.269469 )
									ret := -0.111111
								if( VIP_VIM > -0.269469 )
									ret := 0.571429
						if( ema12 > -0.0006 )
							if( ema3 <= 0.337597 )
								ret := 0.866667 // buy
							if( ema3 > 0.337597 )
								ret := 1.000000 // buy
					if( ema1 > 0.353185 )
						if( ema13 <= -0.002454 )
							if( VIP_VIM <= -0.280612 )
								if( VIP_VIM <= -0.317718 )
									ret := 0.800000 // buy
								if( VIP_VIM > -0.317718 )
									ret := 0.000000
							if( VIP_VIM > -0.280612 )
								if( VIM <= 1.10071 )
									ret := 1.000000 // buy
								if( VIM > 1.10071 )
									ret := 0.862069 // buy
						if( ema13 > -0.002454 )
							if( ema12 <= -0.001277 )
								if( ema3 <= 0.444969 )
									ret := -0.923077 // sell
								if( ema3 > 0.444969 )
									ret := 0.225806
							if( ema12 > -0.001277 )
								if( ema1 <= 0.423732 )
									ret := 0.126214
								if( ema1 > 0.423732 )
									ret := 0.425743
				if( VIP_VIM > -0.248225 )
					if( VIP_VIM <= -0.165641 )
						if( ema13 <= -0.008374 )
							if( VIP_VIM <= -0.2212 )
								ret := 0.916667 // buy
							if( VIP_VIM > -0.2212 )
								ret := 1.000000 // buy
						if( ema13 > -0.008374 )
							if( VIM <= 1.10216 )
								if( VIM <= 1.05622 )
									ret := -0.417085
								if( VIM > 1.05622 )
									ret := -0.050349
							if( VIM > 1.10216 )
								if( ema3 <= 0.72294 )
									ret := 0.287879
								if( ema3 > 0.72294 )
									ret := -0.222222
					if( VIP_VIM > -0.165641 )
						if( VIP_VIM <= -0.108886 )
							if( ema3 <= 0.628548 )
								if( VIP_VIM <= -0.158142 )
									ret := -0.050746
								if( VIP_VIM > -0.158142 )
									ret := 0.195068
							if( ema3 > 0.628548 )
								if( ema1 <= 0.65014 )
									ret := 0.702381 // buy
								if( ema1 > 0.65014 )
									ret := 0.166276
						if( VIP_VIM > -0.108886 )
							if( VIP <= 1.09754 )
								if( ema12 <= -0.001968 )
									ret := 0.527027
								if( ema12 > -0.001968 )
									ret := 0.015407
							if( VIP > 1.09754 )
								if( VIP <= 1.17173 )
									ret := 0.659091
								if( VIP > 1.17173 )
									ret := 0.125000
			if( VIM > 1.10734 )
				if( tema <= 0.457965 )
					if( ema12 <= -0.002007 )
						if( ema3 <= 0.456518 )
							if( ema3 <= 0.34871 )
								if( ema2 <= 0.298143 )
									ret := 0.611940
								if( ema2 > 0.298143 )
									ret := -0.093264
							if( ema3 > 0.34871 )
								if( tema <= 0.346906 )
									ret := 0.968750 // buy
								if( tema > 0.346906 )
									ret := 0.268248
						if( ema3 > 0.456518 )
							if( VIP_VIM <= -0.557586 )
								if( ema12 <= -0.002686 )
									ret := 0.888889 // buy
								if( ema12 > -0.002686 )
									ret := 1.000000 // buy
							if( VIP_VIM > -0.557586 )
								if( ema12 <= -0.003041 )
									ret := 0.923077 // buy
								if( ema12 > -0.003041 )
									ret := 0.508475
					if( ema12 > -0.002007 )
						if( ema12 <= -0.001136 )
							if( tema <= 0.323325 )
								if( VIP <= 0.827732 )
									ret := 0.544693
								if( VIP > 0.827732 )
									ret := -0.186047
							if( tema > 0.323325 )
								if( tema <= 0.362921 )
									ret := -0.066667
								if( tema > 0.362921 )
									ret := 0.110541
						if( ema12 > -0.001136 )
							if( ema13 <= -0.00094 )
								if( ema3 <= 0.445253 )
									ret := -0.051908
								if( ema3 > 0.445253 )
									ret := 0.142424
							if( ema13 > -0.00094 )
								if( ema1 <= 0.382973 )
									ret := 0.166667
								if( ema1 > 0.382973 )
									ret := -0.018362
				if( tema > 0.457965 )
					if( VIM <= 1.21296 )
						if( ema1 <= 0.777072 )
							if( VIP_VIM <= -0.449238 )
								if( ema2 <= 0.675181 )
									ret := 0.350923
								if( ema2 > 0.675181 )
									ret := -0.326087
							if( VIP_VIM > -0.449238 )
								if( ema3 <= 0.530435 )
									ret := -0.078618
								if( ema3 > 0.530435 )
									ret := 0.040533
						if( ema1 > 0.777072 )
							if( tema <= 0.776067 )
								ret := -1.000000 // sell
							if( tema > 0.776067 )
								if( ema1 <= 0.783996 )
									ret := -0.750000 // sell
								if( ema1 > 0.783996 )
									ret := -1.000000 // sell
					if( VIM > 1.21296 )
						if( ema1 <= 0.716903 )
							if( ema3 <= 0.659538 )
								if( VIM <= 1.31434 )
									ret := -0.067321
								if( VIM > 1.31434 )
									ret := -0.268293
							if( ema3 > 0.659538 )
								if( ema13 <= -0.008694 )
									ret := 0.384615
								if( ema13 > -0.008694 )
									ret := -0.466292
						if( ema1 > 0.716903 )
							if( ema12 <= -0.002659 )
								if( ema3 <= 0.761081 )
									ret := 0.216080
								if( ema3 > 0.761081 )
									ret := 0.653846
							if( ema12 > -0.002659 )
								if( ema2 <= 0.736653 )
									ret := 0.400000
								if( ema2 > 0.736653 )
									ret := -0.496403
		if( ema12 > -0.000476 )
			if( VIP_VIM <= 0.844248 )
				if( ema2 <= 0.608848 )
					if( tema <= 0.565753 )
						if( ema3 <= 0.384861 )
							if( ema3 <= 0.373496 )
								if( tema <= 0.372871 )
									ret := 0.000494
								if( tema > 0.372871 )
									ret := -0.255157
							if( ema3 > 0.373496 )
								if( VIP_VIM <= 0.507493 )
									ret := 0.100188
								if( VIP_VIM > 0.507493 )
									ret := -0.207810
						if( ema3 > 0.384861 )
							if( VIP_VIM <= 0.050761 )
								if( VIP <= 1.03279 )
									ret := -0.061824
								if( VIP > 1.03279 )
									ret := -0.247917
							if( VIP_VIM > 0.050761 )
								if( ema1 <= 0.558938 )
									ret := -0.000323
								if( ema1 > 0.558938 )
									ret := -0.281106
					if( tema > 0.565753 )
						if( ema1 <= 0.58791 )
							if( VIP <= 1.3119 )
								if( tema <= 0.58859 )
									ret := 0.150182
								if( tema > 0.58859 )
									ret := 0.630952
							if( VIP > 1.3119 )
								if( ema12 <= 0.002359 )
									ret := -0.577778
								if( ema12 > 0.002359 )
									ret := 0.018182
						if( ema1 > 0.58791 )
							if( VIP_VIM <= 0.160973 )
								if( tema <= 0.602193 )
									ret := -0.170161
								if( tema > 0.602193 )
									ret := 0.081671
							if( VIP_VIM > 0.160973 )
								if( VIP <= 1.19084 )
									ret := 0.101765
								if( VIP > 1.19084 )
									ret := -0.073400
				if( ema2 > 0.608848 )
					if( tema <= 0.774744 )
						if( ema3 <= 0.667939 )
							if( VIP <= 1.08981 )
								if( ema1 <= 0.652029 )
									ret := -0.138727
								if( ema1 > 0.652029 )
									ret := -0.354059
							if( VIP > 1.08981 )
								if( tema <= 0.621494 )
									ret := 0.033223
								if( tema > 0.621494 )
									ret := -0.101775
						if( ema3 > 0.667939 )
							if( ema2 <= 0.724989 )
								if( ema3 <= 0.699691 )
									ret := 0.001381
								if( ema3 > 0.699691 )
									ret := 0.224447
							if( ema2 > 0.724989 )
								if( VIP_VIM <= 0.397861 )
									ret := -0.056440
								if( VIP_VIM > 0.397861 )
									ret := -0.334021
					if( tema > 0.774744 )
						if( ema13 <= 0.007686 )
							if( ema12 <= 0.000276 )
								if( VIP_VIM <= 0.09705 )
									ret := 0.483871
								if( VIP_VIM > 0.09705 )
									ret := -0.875000 // sell
							if( ema12 > 0.000276 )
								if( ema12 <= 0.000672 )
									ret := -0.882353 // sell
								if( ema12 > 0.000672 )
									ret := -0.537634
						if( ema13 > 0.007686 )
							if( ema12 <= 0.004985 )
								ret := 0.666667
							if( ema12 > 0.004985 )
								if( ema13 <= 0.011904 )
									ret := -1.000000 // sell
								if( ema13 > 0.011904 )
									ret := 0.000000
			if( VIP_VIM > 0.844248 )
				if( ema3 <= 0.677402 )
					if( ema3 <= 0.256433 )
						if( ema13 <= 0.001797 )
							if( tema <= 0.251496 )
								ret := -0.500000
							if( tema > 0.251496 )
								ret := -0.250000
						if( ema13 > 0.001797 )
							if( VIM <= 0.492263 )
								ret := -0.818182 // sell
							if( VIM > 0.492263 )
								ret := -1.000000 // sell
					if( ema3 > 0.256433 )
						if( ema1 <= 0.348191 )
							if( VIP <= 1.40786 )
								if( ema2 <= 0.263042 )
									ret := 0.500000
								if( ema2 > 0.263042 )
									ret := 0.954545 // buy
							if( VIP > 1.40786 )
								if( ema3 <= 0.330064 )
									ret := 0.035088
								if( ema3 > 0.330064 )
									ret := 0.588710
						if( ema1 > 0.348191 )
							if( VIM <= 0.512475 )
								if( ema1 <= 0.367302 )
									ret := 0.313725
								if( ema1 > 0.367302 )
									ret := -0.375912
							if( VIM > 0.512475 )
								if( tema <= 0.634653 )
									ret := 0.311628
								if( tema > 0.634653 )
									ret := -0.385714
				if( ema3 > 0.677402 )
					if( ema12 <= 0.007416 )
						if( ema3 <= 0.712089 )
							ret := 1.000000 // buy
						if( ema3 > 0.712089 )
							ret := 0.357143
					if( ema12 > 0.007416 )
						if( ema13 <= 0.01999 )
							if( ema12 <= 0.008471 )
								ret := 0.923077 // buy
							if( ema12 > 0.008471 )
								ret := 1.000000 // buy
						if( ema13 > 0.01999 )
							ret := 0.833333 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_ADAUSDT_5Min_b01e92c8(ema3, tema, ema2, ema12, ema13, ema1, VIP, VIM, VIP_VIM)

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


