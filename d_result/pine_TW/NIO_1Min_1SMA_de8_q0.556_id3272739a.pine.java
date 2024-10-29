//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Smart_Money_Concepts
// ID_model: NIO_1Min_1SMA_3272739a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NIO_1Min_1SMA_3272739a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NIO_1Min_3272739a(Internal_Swing_High, Bearish_BOSInt, Bearish_CHoCHInt, Order_Block_Low, Equilibrium_Zone, Swing_High, Bullish_CHoCHInt, atr, Internal_Swing_Low, FVG_UpInt, Discount_Zone, Bullish_BOSInt, Premium_Zone, Swing_Low, FVG_DownInt, Order_Block_High)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Swing_High <= 3.72978 )
		if( Internal_Swing_Low <= 3.62709 )
			if( atr <= 0.176338 )
				if( Internal_Swing_High <= 3.73052 )
					if( Equilibrium_Zone <= 3.6953 )
						if( Swing_High <= 3.708 )
							if( Swing_High <= 1.845 )
								if( Discount_Zone <= 3.63903 )
									ret := 0.443478
								if( Discount_Zone > 3.63903 )
									ret := -0.062500
							if( Swing_High > 1.845 )
								if( Premium_Zone <= 3.7375 )
									ret := 0.000000
								if( Premium_Zone > 3.7375 )
									ret := -0.142857
						if( Swing_High > 3.708 )
							if( Swing_High <= 3.71172 )
								if( atr <= 0.066938 )
									ret := 0.769231 // buy
								if( atr > 0.066938 )
									ret := 0.375000
							if( Swing_High > 3.71172 )
								ret := 1.000000 // buy
					if( Equilibrium_Zone > 3.6953 )
						if( Equilibrium_Zone <= 5.52433 )
							if( atr <= 0.100963 )
								if( FVG_UpInt <= 0.5 )
									ret := 0.098856
								if( FVG_UpInt > 0.5 )
									ret := -0.568182
							if( atr > 0.100963 )
								if( atr <= 0.142211 )
									ret := -0.060445
								if( atr > 0.142211 )
									ret := 0.088391
						if( Equilibrium_Zone > 5.52433 )
							if( Premium_Zone <= 5.65805 )
								if( Premium_Zone <= 5.62003 )
									ret := -0.018519
								if( Premium_Zone > 5.62003 )
									ret := -0.615385
							if( Premium_Zone > 5.65805 )
								if( Discount_Zone <= 6.83 )
									ret := -0.091954
								if( Discount_Zone > 6.83 )
									ret := 0.391304
				if( Internal_Swing_High > 3.73052 )
					if( Discount_Zone <= 3.68715 )
						if( Internal_Swing_High <= 3.79609 )
							if( atr <= 0.130924 )
								if( Internal_Swing_High <= 3.77706 )
									ret := -0.545455
								if( Internal_Swing_High > 3.77706 )
									ret := 0.000000
							if( atr > 0.130924 )
								if( Internal_Swing_High <= 3.775 )
									ret := -0.400000
								if( Internal_Swing_High > 3.775 )
									ret := 0.588235
						if( Internal_Swing_High > 3.79609 )
							if( Equilibrium_Zone <= 3.8475 )
								if( atr <= 0.144482 )
									ret := -0.755556 // sell
								if( atr > 0.144482 )
									ret := -0.463918
							if( Equilibrium_Zone > 3.8475 )
								if( Internal_Swing_High <= 3.90019 )
									ret := 0.041667
								if( Internal_Swing_High > 3.90019 )
									ret := -0.428571
					if( Discount_Zone > 3.68715 )
						if( Premium_Zone <= 7.02255 )
							if( Discount_Zone <= 3.71996 )
								if( Internal_Swing_High <= 3.7662 )
									ret := -0.314286
								if( Internal_Swing_High > 3.7662 )
									ret := 0.217687
							if( Discount_Zone > 3.71996 )
								if( Internal_Swing_High <= 3.77852 )
									ret := -0.750000 // sell
								if( Internal_Swing_High > 3.77852 )
									ret := -0.055535
						if( Premium_Zone > 7.02255 )
							if( Premium_Zone <= 7.26495 )
								if( Equilibrium_Zone <= 7.1075 )
									ret := 0.777778 // buy
								if( Equilibrium_Zone > 7.1075 )
									ret := -0.250000
							if( Premium_Zone > 7.26495 )
								if( Equilibrium_Zone <= 7.11 )
									ret := -1.000000 // sell
								if( Equilibrium_Zone > 7.11 )
									ret := 0.000000
			if( atr > 0.176338 )
				if( Internal_Swing_High <= 6.87995 )
					if( Discount_Zone <= 3.59558 )
						if( Equilibrium_Zone <= 3.80119 )
							if( Internal_Swing_High <= 3.84914 )
								if( Discount_Zone <= 3.4448 )
									ret := 0.117647
								if( Discount_Zone > 3.4448 )
									ret := 0.621094
							if( Internal_Swing_High > 3.84914 )
								if( Discount_Zone <= 3.502 )
									ret := 0.655172
								if( Discount_Zone > 3.502 )
									ret := -0.187500
						if( Equilibrium_Zone > 3.80119 )
							if( Discount_Zone <= 3.55571 )
								if( Premium_Zone <= 4.09379 )
									ret := 0.500000
								if( Premium_Zone > 4.09379 )
									ret := -0.631579
							if( Discount_Zone > 3.55571 )
								if( Equilibrium_Zone <= 3.88997 )
									ret := 0.304348
								if( Equilibrium_Zone > 3.88997 )
									ret := 0.609756
					if( Discount_Zone > 3.59558 )
						if( Premium_Zone <= 4.04238 )
							if( Premium_Zone <= 4.01999 )
								if( Discount_Zone <= 3.64053 )
									ret := 0.312500
								if( Discount_Zone > 3.64053 )
									ret := -0.857143 // sell
							if( Premium_Zone > 4.01999 )
								if( Discount_Zone <= 3.60628 )
									ret := 0.000000
								if( Discount_Zone > 3.60628 )
									ret := -0.800000 // sell
						if( Premium_Zone > 4.04238 )
							if( atr <= 0.38005 )
								if( atr <= 0.199318 )
									ret := 0.112108
								if( atr > 0.199318 )
									ret := -0.000430
							if( atr > 0.38005 )
								if( Discount_Zone <= 4.54357 )
									ret := 0.326230
								if( Discount_Zone > 4.54357 )
									ret := 0.071072
				if( Internal_Swing_High > 6.87995 )
					if( Discount_Zone <= 7.05203 )
						if( atr <= 0.879128 )
							if( Internal_Swing_High <= 7.53098 )
								if( Internal_Swing_High <= 7.49867 )
									ret := -0.216339
								if( Internal_Swing_High > 7.49867 )
									ret := 0.333333
							if( Internal_Swing_High > 7.53098 )
								if( atr <= 0.557975 )
									ret := -0.916667 // sell
								if( atr > 0.557975 )
									ret := -0.562500
						if( atr > 0.879128 )
							if( Internal_Swing_High <= 7.415 )
								if( Equilibrium_Zone <= 7.34694 )
									ret := 0.447059
								if( Equilibrium_Zone > 7.34694 )
									ret := -0.800000 // sell
							if( Internal_Swing_High > 7.415 )
								if( Discount_Zone <= 6.04925 )
									ret := -1.000000 // sell
								if( Discount_Zone > 6.04925 )
									ret := -0.750000 // sell
					if( Discount_Zone > 7.05203 )
						if( Discount_Zone <= 7.20348 )
							if( Equilibrium_Zone <= 7.38926 )
								if( atr <= 0.190118 )
									ret := 0.142857
								if( atr > 0.190118 )
									ret := 0.888889 // buy
							if( Equilibrium_Zone > 7.38926 )
								if( Equilibrium_Zone <= 7.5391 )
									ret := -0.600000
								if( Equilibrium_Zone > 7.5391 )
									ret := 0.600000
						if( Discount_Zone > 7.20348 )
							ret := -0.571429
		if( Internal_Swing_Low > 3.62709 )
			if( Equilibrium_Zone <= 3.78452 )
				if( Swing_Low <= 3.72106 )
					if( atr <= 0.071264 )
						if( Internal_Swing_Low <= 3.78984 )
							if( Discount_Zone <= 3.71893 )
								if( Swing_Low <= 3.71208 )
									ret := 0.648276
								if( Swing_Low > 3.71208 )
									ret := 0.000000
							if( Discount_Zone > 3.71893 )
								if( Equilibrium_Zone <= 3.77931 )
									ret := -0.833333 // sell
								if( Equilibrium_Zone > 3.77931 )
									ret := 0.421053
						if( Internal_Swing_Low > 3.78984 )
							if( Premium_Zone <= 3.84504 )
								if( Internal_Swing_Low <= 3.92217 )
									ret := 0.181818
								if( Internal_Swing_Low > 3.92217 )
									ret := -0.050000
							if( Premium_Zone > 3.84504 )
								ret := -1.000000 // sell
					if( atr > 0.071264 )
						if( atr <= 0.114939 )
							if( Equilibrium_Zone <= 3.72243 )
								if( Equilibrium_Zone <= 3.71047 )
									ret := -0.275862
								if( Equilibrium_Zone > 3.71047 )
									ret := -0.750000 // sell
							if( Equilibrium_Zone > 3.72243 )
								if( Premium_Zone <= 3.84019 )
									ret := 0.405063
								if( Premium_Zone > 3.84019 )
									ret := -0.111111
						if( atr > 0.114939 )
							if( Discount_Zone <= 3.51949 )
								if( Internal_Swing_Low <= 3.86777 )
									ret := 0.818182 // buy
								if( Internal_Swing_Low > 3.86777 )
									ret := 0.428571
							if( Discount_Zone > 3.51949 )
								if( Equilibrium_Zone <= 3.77002 )
									ret := 0.158683
								if( Equilibrium_Zone > 3.77002 )
									ret := 0.502242
				if( Swing_Low > 3.72106 )
					if( Swing_Low <= 3.915 )
						if( Premium_Zone <= 3.84332 )
							if( Internal_Swing_Low <= 3.7693 )
								if( atr <= 0.05607 )
									ret := 0.325000
								if( atr > 0.05607 )
									ret := 0.875000 // buy
							if( Internal_Swing_Low > 3.7693 )
								if( Premium_Zone <= 3.8395 )
									ret := 0.888889 // buy
								if( Premium_Zone > 3.8395 )
									ret := 0.727273 // buy
						if( Premium_Zone > 3.84332 )
							if( Order_Block_High <= 3.73715 )
								if( Swing_Low <= 3.72975 )
									ret := 1.000000 // buy
								if( Swing_Low > 3.72975 )
									ret := 0.403509
							if( Order_Block_High > 3.73715 )
								ret := -0.333333
					if( Swing_Low > 3.915 )
						if( Internal_Swing_High <= 1.96 )
							ret := 0.000000
						if( Internal_Swing_High > 1.96 )
							ret := -0.285714
			if( Equilibrium_Zone > 3.78452 )
				if( atr <= 0.119981 )
					if( Swing_Low <= 4.7604 )
						if( Internal_Swing_High <= 3.79011 )
							if( Internal_Swing_Low <= 4.40941 )
								if( atr <= 0.059905 )
									ret := 0.337215
								if( atr > 0.059905 )
									ret := 0.204637
							if( Internal_Swing_Low > 4.40941 )
								if( Discount_Zone <= 4.44017 )
									ret := 0.039028
								if( Discount_Zone > 4.44017 )
									ret := 0.186094
						if( Internal_Swing_High > 3.79011 )
							if( Equilibrium_Zone <= 3.85129 )
								if( Equilibrium_Zone <= 3.83519 )
									ret := -0.090000
								if( Equilibrium_Zone > 3.83519 )
									ret := -0.698113
							if( Equilibrium_Zone > 3.85129 )
								if( Internal_Swing_Low <= 3.8507 )
									ret := 0.582609
								if( Internal_Swing_Low > 3.8507 )
									ret := 0.114582
					if( Swing_Low > 4.7604 )
						if( Internal_Swing_Low <= 6.23578 )
							if( atr <= 0.049972 )
								if( Equilibrium_Zone <= 4.81395 )
									ret := 1.000000 // buy
								if( Equilibrium_Zone > 4.81395 )
									ret := 0.151751
							if( atr > 0.049972 )
								if( atr <= 0.085903 )
									ret := -0.054496
								if( atr > 0.085903 )
									ret := 0.077157
						if( Internal_Swing_Low > 6.23578 )
							if( Premium_Zone <= 6.4176 )
								if( Internal_Swing_Low <= 6.27018 )
									ret := -0.210526
								if( Internal_Swing_Low > 6.27018 )
									ret := -0.933333 // sell
							if( Premium_Zone > 6.4176 )
								if( atr <= 0.09959 )
									ret := 0.227273
								if( atr > 0.09959 )
									ret := 0.000000
				if( atr > 0.119981 )
					if( Equilibrium_Zone <= 7.39411 )
						if( atr <= 0.812683 )
							if( atr <= 0.723853 )
								if( Discount_Zone <= 3.50298 )
									ret := 0.792208 // buy
								if( Discount_Zone > 3.50298 )
									ret := 0.060042
							if( atr > 0.723853 )
								if( Bearish_BOSInt <= 0.5 )
									ret := -0.802817 // sell
								if( Bearish_BOSInt > 0.5 )
									ret := 0.066667
						if( atr > 0.812683 )
							if( Swing_Low <= 6.01182 )
								if( Equilibrium_Zone <= 7.28121 )
									ret := 0.338078
								if( Equilibrium_Zone > 7.28121 )
									ret := -0.600000
							if( Swing_Low > 6.01182 )
								if( Premium_Zone <= 8.21136 )
									ret := 0.952381 // buy
								if( Premium_Zone > 8.21136 )
									ret := 0.611111
					if( Equilibrium_Zone > 7.39411 )
						if( Discount_Zone <= 7.20193 )
							if( Equilibrium_Zone <= 7.52475 )
								if( Discount_Zone <= 6.96067 )
									ret := -0.555556
								if( Discount_Zone > 6.96067 )
									ret := 0.110000
							if( Equilibrium_Zone > 7.52475 )
								if( atr <= 0.345174 )
									ret := -0.529412
								if( atr > 0.345174 )
									ret := -1.000000 // sell
						if( Discount_Zone > 7.20193 )
							if( Internal_Swing_Low <= 7.3852 )
								if( Discount_Zone <= 7.2646 )
									ret := 1.000000 // buy
								if( Discount_Zone > 7.2646 )
									ret := 0.687500
							if( Internal_Swing_Low > 7.3852 )
								ret := 0.142857
	if( Swing_High > 3.72978 )
		if( atr <= 0.161792 )
			if( atr <= 0.059963 )
				if( Swing_Low <= 4.17589 )
					if( Discount_Zone <= 6.5214 )
						if( Discount_Zone <= 4.98735 )
							if( Swing_High <= 4.88018 )
								if( Equilibrium_Zone <= 4.78106 )
									ret := -0.273333
								if( Equilibrium_Zone > 4.78106 )
									ret := -0.023121
							if( Swing_High > 4.88018 )
								if( Discount_Zone <= 4.85908 )
									ret := -0.824561 // sell
								if( Discount_Zone > 4.85908 )
									ret := -0.258065
						if( Discount_Zone > 4.98735 )
							if( Internal_Swing_High <= 5.28949 )
								if( Equilibrium_Zone <= 5.26511 )
									ret := 0.020134
								if( Equilibrium_Zone > 5.26511 )
									ret := 0.727273 // buy
							if( Internal_Swing_High > 5.28949 )
								if( Premium_Zone <= 5.45325 )
									ret := -0.509804
								if( Premium_Zone > 5.45325 )
									ret := -0.084507
					if( Discount_Zone > 6.5214 )
						if( Premium_Zone <= 6.88047 )
							ret := -0.909091 // sell
						if( Premium_Zone > 6.88047 )
							ret := -1.000000 // sell
				if( Swing_Low > 4.17589 )
					if( Internal_Swing_High <= 4.675 )
						if( Swing_High <= 4.31577 )
							ret := 0.100000
						if( Swing_High > 4.31577 )
							if( Swing_Low <= 4.52072 )
								if( Premium_Zone <= 4.52593 )
									ret := 0.736842 // buy
								if( Premium_Zone > 4.52593 )
									ret := 0.125000
							if( Swing_Low > 4.52072 )
								if( Internal_Swing_High <= 4.65029 )
									ret := 0.777778 // buy
								if( Internal_Swing_High > 4.65029 )
									ret := 1.000000 // buy
					if( Internal_Swing_High > 4.675 )
						if( Premium_Zone <= 4.80239 )
							ret := -0.750000 // sell
						if( Premium_Zone > 4.80239 )
							if( atr <= 0.054773 )
								if( Discount_Zone <= 5.5275 )
									ret := 0.111111
								if( Discount_Zone > 5.5275 )
									ret := 0.461538
							if( atr > 0.054773 )
								ret := 0.800000 // buy
			if( atr > 0.059963 )
				if( Internal_Swing_Low <= 3.91757 )
					if( Discount_Zone <= 3.70233 )
						if( Discount_Zone <= 3.64107 )
							if( Discount_Zone <= 3.5759 )
								if( Swing_High <= 3.78112 )
									ret := -0.076923
								if( Swing_High > 3.78112 )
									ret := 0.933333 // buy
							if( Discount_Zone > 3.5759 )
								if( Internal_Swing_Low <= 1.85 )
									ret := -0.477941
								if( Internal_Swing_Low > 1.85 )
									ret := 0.081967
						if( Discount_Zone > 3.64107 )
							if( atr <= 0.147747 )
								if( Order_Block_High <= 3.81995 )
									ret := 0.714286 // buy
								if( Order_Block_High > 3.81995 )
									ret := -0.272727
							if( atr > 0.147747 )
								if( Internal_Swing_High <= 3.81639 )
									ret := 1.000000 // buy
								if( Internal_Swing_High > 3.81639 )
									ret := -0.428571
					if( Discount_Zone > 3.70233 )
						if( Premium_Zone <= 3.89237 )
							if( Premium_Zone <= 3.85247 )
								if( atr <= 0.061592 )
									ret := -0.250000
								if( atr > 0.061592 )
									ret := -0.958333 // sell
							if( Premium_Zone > 3.85247 )
								if( Equilibrium_Zone <= 3.80019 )
									ret := -0.274510
								if( Equilibrium_Zone > 3.80019 )
									ret := -0.793103 // sell
						if( Premium_Zone > 3.89237 )
							if( Premium_Zone <= 3.9786 )
								if( Internal_Swing_High <= 3.89204 )
									ret := -0.017442
								if( Internal_Swing_High > 3.89204 )
									ret := 0.362416
							if( Premium_Zone > 3.9786 )
								if( Equilibrium_Zone <= 4.07866 )
									ret := -0.245731
								if( Equilibrium_Zone > 4.07866 )
									ret := -0.076992
				if( Internal_Swing_Low > 3.91757 )
					if( Order_Block_High <= 4.515 )
						if( Discount_Zone <= 5.74642 )
							if( Discount_Zone <= 5.655 )
								if( Internal_Swing_Low <= 5.54971 )
									ret := 0.048797
								if( Internal_Swing_Low > 5.54971 )
									ret := -0.302632
							if( Discount_Zone > 5.655 )
								if( Swing_High <= 5.86204 )
									ret := 0.312500
								if( Swing_High > 5.86204 )
									ret := 0.882353 // buy
						if( Discount_Zone > 5.74642 )
							if( Internal_Swing_High <= 5.95853 )
								if( atr <= 0.075 )
									ret := -1.000000 // sell
								if( atr > 0.075 )
									ret := -0.750000 // sell
							if( Internal_Swing_High > 5.95853 )
								if( Premium_Zone <= 6.96989 )
									ret := -0.083969
								if( Premium_Zone > 6.96989 )
									ret := -0.650000
					if( Order_Block_High > 4.515 )
						if( Internal_Swing_Low <= 5.6766 )
							if( Premium_Zone <= 4.93582 )
								if( Order_Block_High <= 4.61209 )
									ret := -0.692308
								if( Order_Block_High > 4.61209 )
									ret := -0.066667
							if( Premium_Zone > 4.93582 )
								if( atr <= 0.11814 )
									ret := -0.861111 // sell
								if( atr > 0.11814 )
									ret := -0.615385
						if( Internal_Swing_Low > 5.6766 )
							if( Discount_Zone <= 5.8877 )
								ret := 0.750000 // buy
							if( Discount_Zone > 5.8877 )
								ret := 0.750000 // buy
		if( atr > 0.161792 )
			if( atr <= 0.93005 )
				if( Premium_Zone <= 5.52969 )
					if( Internal_Swing_High <= 5.03071 )
						if( Premium_Zone <= 4.94663 )
							if( Discount_Zone <= 4.56198 )
								if( Internal_Swing_Low <= 4.4725 )
									ret := 0.053493
								if( Internal_Swing_Low > 4.4725 )
									ret := 0.402299
							if( Discount_Zone > 4.56198 )
								if( atr <= 0.185573 )
									ret := 0.854839 // buy
								if( atr > 0.185573 )
									ret := 0.045455
						if( Premium_Zone > 4.94663 )
							if( Order_Block_High <= 5.00899 )
								if( Discount_Zone <= 4.37033 )
									ret := 0.243902
								if( Discount_Zone > 4.37033 )
									ret := -0.299505
							if( Order_Block_High > 5.00899 )
								if( Premium_Zone <= 5.19866 )
									ret := 1.000000 // buy
								if( Premium_Zone > 5.19866 )
									ret := 0.400000
					if( Internal_Swing_High > 5.03071 )
						if( Premium_Zone <= 5.27993 )
							if( Equilibrium_Zone <= 4.91514 )
								ret := -0.500000
							if( Equilibrium_Zone > 4.91514 )
								if( Discount_Zone <= 4.75478 )
									ret := 0.952381 // buy
								if( Discount_Zone > 4.75478 )
									ret := 0.629032
						if( Premium_Zone > 5.27993 )
							if( Internal_Swing_High <= 5.19154 )
								if( Swing_High <= 5.15076 )
									ret := 0.295652
								if( Swing_High > 5.15076 )
									ret := -0.493827
							if( Internal_Swing_High > 5.19154 )
								if( Discount_Zone <= 4.9641 )
									ret := 0.495385
								if( Discount_Zone > 4.9641 )
									ret := 0.234375
				if( Premium_Zone > 5.52969 )
					if( Swing_High <= 5.32001 )
						if( Equilibrium_Zone <= 5.18565 )
							if( atr <= 0.543616 )
								if( Premium_Zone <= 5.54462 )
									ret := 0.500000
								if( Premium_Zone > 5.54462 )
									ret := -0.277778
							if( atr > 0.543616 )
								if( Swing_High <= 5.31445 )
									ret := 1.000000 // buy
								if( Swing_High > 5.31445 )
									ret := 0.250000
						if( Equilibrium_Zone > 5.18565 )
							if( Internal_Swing_High <= 5.31051 )
								if( Internal_Swing_High <= 5.30769 )
									ret := -0.765957 // sell
								if( Internal_Swing_High > 5.30769 )
									ret := -0.285714
							if( Internal_Swing_High > 5.31051 )
								ret := -1.000000 // sell
					if( Swing_High > 5.32001 )
						if( Internal_Swing_Low <= 5.93145 )
							if( Discount_Zone <= 4.48547 )
								if( Internal_Swing_High <= 5.505 )
									ret := 0.416667
								if( Internal_Swing_High > 5.505 )
									ret := 0.923077 // buy
							if( Discount_Zone > 4.48547 )
								if( Discount_Zone <= 4.84415 )
									ret := -0.558333
								if( Discount_Zone > 4.84415 )
									ret := 0.042964
						if( Internal_Swing_Low > 5.93145 )
							if( Internal_Swing_Low <= 6.24568 )
								if( atr <= 0.184183 )
									ret := 0.000000
								if( atr > 0.184183 )
									ret := 0.833333 // buy
							if( Internal_Swing_Low > 6.24568 )
								if( Internal_Swing_Low <= 6.78 )
									ret := -0.076923
								if( Internal_Swing_Low > 6.78 )
									ret := 0.252747
			if( atr > 0.93005 )
				if( Internal_Swing_Low <= 3.02 )
					if( Equilibrium_Zone <= 6.97971 )
						if( Order_Block_High <= 6.0975 )
							if( Internal_Swing_High <= 6.04828 )
								ret := 1.000000 // buy
							if( Internal_Swing_High > 6.04828 )
								if( Equilibrium_Zone <= 5.91565 )
									ret := 0.000000
								if( Equilibrium_Zone > 5.91565 )
									ret := 0.897436 // buy
						if( Order_Block_High > 6.0975 )
							if( Equilibrium_Zone <= 5.98668 )
								ret := 0.250000
							if( Equilibrium_Zone > 5.98668 )
								ret := 0.750000 // buy
					if( Equilibrium_Zone > 6.97971 )
						ret := 0.000000
				if( Internal_Swing_Low > 3.02 )
					ret := 0.058824
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Smart_Money_Concepts 
//@version=5
//indicator "Smart Money Concepts - Pine Script Version", overlay=true)

// Constants
SWING_LENGTH = 50
INTERNAL_SWING_LENGTH = 5
ATR_PERIOD = 200

// ATR Calculation
atr = ta.sma(ta.tr, ATR_PERIOD)

// Swings Detection
var float Swing_High = na
var float Swing_Low = na
Swing_High := ta.highest(high, SWING_LENGTH) == high ? high : na
Swing_Low := ta.lowest(low, SWING_LENGTH) == low ? low : na

var float Internal_Swing_High = na
var float Internal_Swing_Low = na
Internal_Swing_High := ta.highest(high, INTERNAL_SWING_LENGTH) == high ? high : na
Internal_Swing_Low := ta.lowest(low, INTERNAL_SWING_LENGTH) == low ? low : na

// Market Structure Detection
Bullish_BOS = (close > ta.valuewhen(Swing_High, Swing_High, 1)) and not na(Swing_High[1])
Bearish_BOS = (close < ta.valuewhen(Swing_Low, Swing_Low, 1)) and not na(Swing_Low[1])

Bullish_CHoCH = (close > ta.valuewhen(Swing_High, Swing_High, 1)) and (close[1] < ta.valuewhen(Swing_Low, Swing_Low, 1))
Bearish_CHoCH = (close < ta.valuewhen(Swing_Low, Swing_Low, 1)) and (close[1] > ta.valuewhen(Swing_High, Swing_High, 1))

Bullish_BOSInt = Bullish_BOS ? 1 : 0
Bearish_BOSInt = Bearish_BOS ? 1 : 0
Bullish_CHoCHInt = Bullish_CHoCH ? 1 : 0
Bearish_CHoCHInt = Bearish_CHoCH ? 1 : 0

// Order Blocks Detection
var float Order_Block_High = na
var float Order_Block_Low = na

threshold = atr
if Bullish_BOS
    Order_Block_High := high
    Order_Block_Low := low
if Bearish_BOS
    Order_Block_High := high
    Order_Block_Low := low

if math.abs(Order_Block_High - Order_Block_Low) > threshold
    Order_Block_High := na
    Order_Block_Low := na

// Fair Value Gaps (FVG) Detection
delta_per = (close - open) / open * 100
FVG_Up = (low > high[2]) and (close > high[2]) and (delta_per > atr)
FVG_Down = (high < low[2]) and (close < low[2]) and (-delta_per > atr)

FVG_UpInt = FVG_Up ? 1 : 0
FVG_DownInt = FVG_Down ? 1 : 0

// Premium/Discount Zones Calculation
avg_price = (ta.valuewhen(Swing_High, Swing_High, 0) + ta.valuewhen(Swing_Low, Swing_Low, 0)) / 2
var float Premium_Zone = avg_price + atr
var float Discount_Zone = avg_price - atr
var float Equilibrium_Zone = avg_price

// Plotting
plot(close, title="Close", color=color.black)

plotshape(series=Swing_High, location=location.abovebar, color=color.green, style=shape.triangledown, title="Swing High")
plotshape(series=Swing_Low, location=location.belowbar, color=color.red, style=shape.triangleup, title="Swing Low")

plotshape(series=Bullish_BOS, location=location.belowbar, color=color.blue, style=shape.circle, title="Bullish BOS")
plotshape(series=Bearish_BOS, location=location.abovebar, color=color.orange, style=shape.circle, title="Bearish BOS")
plotshape(series=Bullish_CHoCH, location=location.belowbar, color=color.aqua, style=shape.square, title="Bullish CHoCH")
plotshape(series=Bearish_CHoCH, location=location.abovebar, color=color.purple, style=shape.square, title="Bearish CHoCH")

plot(Order_Block_High, title="Order Block High", color=color.yellow, style=plot.style_linebr)
plot(Order_Block_Low, title="Order Block Low", color=color.yellow, style=plot.style_linebr)

bgcolor(FVG_Up ? color.new(color.green, 80) : na, title="Bullish FVG")
bgcolor(FVG_Down ? color.new(color.red, 80) : na, title="Bearish FVG")

plot(Premium_Zone, "Premium Zone", color=color.red)
plot(Discount_Zone, "Discount Zone", color=color.green)
plot(Equilibrium_Zone, "Equilibrium Zone", color=color.gray)

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
float op_operation = decision_tree_0_NIO_1Min_3272739a(Internal_Swing_High, Bearish_BOSInt, Bearish_CHoCHInt, Order_Block_Low, Equilibrium_Zone, Swing_High, Bullish_CHoCHInt, atr, Internal_Swing_Low, FVG_UpInt, Discount_Zone, Bullish_BOSInt, Premium_Zone, Swing_Low, FVG_DownInt, Order_Block_High)

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


