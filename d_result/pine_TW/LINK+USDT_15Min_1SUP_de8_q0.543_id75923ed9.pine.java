//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: SuperTrend
// ID_model: LINKUSDT_15Min_1SUP_75923ed9 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LINKUSDT_15Min_1SUP_75923ed9", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LINKUSDT_15Min_75923ed9(dn1, trend, atr, atr2, buySignalInt, sellSignalInt, up1, up, dn)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( atr <= 0.036125 )
		if( up1 <= 5.66428 )
			if( atr <= 0.022619 )
				if( up <= 5.14425 )
					if( up <= 5.05829 )
						if( dn <= 5.16483 )
							if( atr <= 0.021532 )
								if( atr <= 0.017988 )
									ret := 0.000000
								if( atr > 0.017988 )
									ret := 0.111111
							if( atr > 0.021532 )
								ret := -0.250000
						if( dn > 5.16483 )
							if( dn <= 5.17271 )
								ret := 1.000000 // buy
							if( dn > 5.17271 )
								ret := 0.400000
					if( up > 5.05829 )
						if( atr2 <= 0.015193 )
							if( dn1 <= 5.19838 )
								if( up1 <= 5.10909 )
									ret := -0.875000 // sell
								if( up1 > 5.10909 )
									ret := -0.571429
							if( dn1 > 5.19838 )
								ret := 0.000000
						if( atr2 > 0.015193 )
							if( up <= 5.10939 )
								if( up1 <= 5.08042 )
									ret := -0.052632
								if( up1 > 5.08042 )
									ret := 0.250000
							if( up > 5.10939 )
								if( atr2 <= 0.02415 )
									ret := -0.361702
								if( atr2 > 0.02415 )
									ret := -1.000000 // sell
				if( up > 5.14425 )
					if( up <= 5.20965 )
						if( dn1 <= 5.30456 )
							if( atr <= 0.018824 )
								if( atr2 <= 0.018829 )
									ret := 0.151515
								if( atr2 > 0.018829 )
									ret := -0.428571
							if( atr > 0.018824 )
								if( dn1 <= 5.28722 )
									ret := 0.647059
								if( dn1 > 5.28722 )
									ret := 0.210526
						if( dn1 > 5.30456 )
							if( atr2 <= 0.02025 )
								if( dn <= 5.30456 )
									ret := 0.500000
								if( dn > 5.30456 )
									ret := 1.000000 // buy
							if( atr2 > 0.02025 )
								if( up1 <= 5.19706 )
									ret := 0.000000
								if( up1 > 5.19706 )
									ret := 0.750000 // buy
					if( up > 5.20965 )
						if( up1 <= 5.25075 )
							if( up1 <= 5.24497 )
								if( up1 <= 5.21989 )
									ret := 0.055556
								if( up1 > 5.21989 )
									ret := -0.232143
							if( up1 > 5.24497 )
								if( up1 <= 5.24972 )
									ret := -0.500000
								if( up1 > 5.24972 )
									ret := -1.000000 // sell
						if( up1 > 5.25075 )
							if( dn <= 5.55319 )
								if( up <= 5.41562 )
									ret := 0.055556
								if( up > 5.41562 )
									ret := 0.581818
							if( dn > 5.55319 )
								if( atr2 <= 0.01975 )
									ret := 0.055749
								if( atr2 > 0.01975 )
									ret := -0.213483
			if( atr > 0.022619 )
				if( dn <= 5.21793 )
					if( dn <= 5.1365 )
						if( atr <= 0.023752 )
							ret := 0.750000 // buy
						if( atr > 0.023752 )
							if( dn <= 5.08894 )
								ret := 0.750000 // buy
							if( dn > 5.08894 )
								ret := 1.000000 // buy
					if( dn > 5.1365 )
						if( atr2 <= 0.029505 )
							if( atr <= 0.028061 )
								if( up1 <= 5.02773 )
									ret := 0.000000
								if( up1 > 5.02773 )
									ret := 0.575000
							if( atr > 0.028061 )
								if( dn1 <= 5.19445 )
									ret := 0.785714 // buy
								if( dn1 > 5.19445 )
									ret := 1.000000 // buy
						if( atr2 > 0.029505 )
							if( dn1 <= 5.17088 )
								ret := -0.750000 // sell
							if( dn1 > 5.17088 )
								ret := 0.000000
				if( dn > 5.21793 )
					if( up <= 5.28067 )
						if( up1 <= 5.15534 )
							if( up1 <= 5.08934 )
								if( up <= 5.07515 )
									ret := -0.466667
								if( up > 5.07515 )
									ret := -0.045455
							if( up1 > 5.08934 )
								if( dn <= 5.26237 )
									ret := 0.820000 // buy
								if( dn > 5.26237 )
									ret := 0.285714
						if( up1 > 5.15534 )
							if( atr <= 0.0315 )
								if( atr2 <= 0.0248 )
									ret := 0.291667
								if( atr2 > 0.0248 )
									ret := -0.178571
							if( atr > 0.0315 )
								if( atr2 <= 0.03435 )
									ret := -0.812500 // sell
								if( atr2 > 0.03435 )
									ret := 0.000000
					if( up > 5.28067 )
						if( atr2 <= 0.022742 )
							if( up1 <= 5.61206 )
								if( up <= 5.59835 )
									ret := -0.076923
								if( up > 5.59835 )
									ret := -0.750000 // sell
							if( up1 > 5.61206 )
								if( dn <= 5.75242 )
									ret := 0.750000 // buy
								if( dn > 5.75242 )
									ret := 0.166667
						if( atr2 > 0.022742 )
							if( up <= 5.49394 )
								if( atr2 <= 0.023768 )
									ret := 0.843750 // buy
								if( atr2 > 0.023768 )
									ret := 0.547368
							if( up > 5.49394 )
								if( up1 <= 5.61234 )
									ret := 0.063158
								if( up1 > 5.61234 )
									ret := 0.576471
		if( up1 > 5.66428 )
			if( atr2 <= 0.0316 )
				if( dn <= 8.07573 )
					if( dn <= 7.60392 )
						if( dn1 <= 7.15872 )
							if( up1 <= 6.88887 )
								if( dn <= 6.8756 )
									ret := -0.017918
								if( dn > 6.8756 )
									ret := 0.038462
							if( up1 > 6.88887 )
								if( atr2 <= 0.028264 )
									ret := -0.217964
								if( atr2 > 0.028264 )
									ret := 0.034188
						if( dn1 > 7.15872 )
							if( up <= 7.12087 )
								if( atr <= 0.025951 )
									ret := 0.312893
								if( atr > 0.025951 )
									ret := 0.018018
							if( up > 7.12087 )
								if( dn <= 7.57261 )
									ret := -0.029120
								if( dn > 7.57261 )
									ret := 0.200000
					if( dn > 7.60392 )
						if( atr <= 0.032808 )
							if( up <= 7.61785 )
								if( up <= 7.58481 )
									ret := -0.073759
								if( up > 7.58481 )
									ret := -0.510870
							if( up > 7.61785 )
								if( up <= 7.63905 )
									ret := 0.434783
								if( up > 7.63905 )
									ret := -0.037221
						if( atr > 0.032808 )
							if( atr <= 0.033456 )
								if( up <= 7.7267 )
									ret := -0.428571
								if( up > 7.7267 )
									ret := -1.000000 // sell
							if( atr > 0.033456 )
								if( up1 <= 7.72545 )
									ret := -0.289474
								if( up1 > 7.72545 )
									ret := 0.142857
				if( dn > 8.07573 )
					if( up <= 9.9996 )
						if( atr <= 0.027626 )
							if( up1 <= 8.04019 )
								if( atr <= 0.027333 )
									ret := 0.611111
								if( atr > 0.027333 )
									ret := 1.000000 // buy
							if( up1 > 8.04019 )
								if( up <= 8.83964 )
									ret := -0.111111
								if( up > 8.83964 )
									ret := 0.750000 // buy
						if( atr > 0.027626 )
							if( dn <= 8.19957 )
								if( dn <= 8.10844 )
									ret := 0.280000
								if( dn > 8.10844 )
									ret := 0.000000
							if( dn > 8.19957 )
								if( atr <= 0.032127 )
									ret := 0.230769
								if( atr > 0.032127 )
									ret := 1.000000 // buy
					if( up > 9.9996 )
						if( up <= 11.0576 )
							if( up <= 10.0655 )
								if( up <= 10.0037 )
									ret := 0.142857
								if( up > 10.0037 )
									ret := 0.000000
							if( up > 10.0655 )
								if( dn <= 10.4592 )
									ret := -0.666667
								if( dn > 10.4592 )
									ret := -0.153846
						if( up > 11.0576 )
							if( dn <= 13.7077 )
								if( atr2 <= 0.02935 )
									ret := 0.000000
								if( atr2 > 0.02935 )
									ret := 0.400000
							if( dn > 13.7077 )
								if( atr2 <= 0.03005 )
									ret := 0.000000
								if( atr2 > 0.03005 )
									ret := -0.500000
			if( atr2 > 0.0316 )
				if( dn <= 6.10025 )
					if( up1 <= 5.81429 )
						if( up1 <= 5.79256 )
							if( up1 <= 5.77443 )
								if( dn <= 5.90859 )
									ret := -0.421053
								if( dn > 5.90859 )
									ret := 0.240000
							if( up1 > 5.77443 )
								if( atr <= 0.035412 )
									ret := -0.555556
								if( atr > 0.035412 )
									ret := -1.000000 // sell
						if( up1 > 5.79256 )
							if( atr2 <= 0.03645 )
								if( dn <= 5.97408 )
									ret := 0.750000 // buy
								if( dn > 5.97408 )
									ret := 1.000000 // buy
							if( atr2 > 0.03645 )
								ret := 0.000000
					if( up1 > 5.81429 )
						if( up <= 5.8524 )
							if( dn1 <= 6.03421 )
								ret := -1.000000 // sell
							if( dn1 > 6.03421 )
								if( up1 <= 5.84281 )
									ret := -0.950000 // sell
								if( up1 > 5.84281 )
									ret := -0.666667
						if( up > 5.8524 )
							if( dn <= 6.0584 )
								if( dn1 <= 6.06522 )
									ret := 0.000000
								if( dn1 > 6.06522 )
									ret := 0.250000
							if( dn > 6.0584 )
								if( up <= 5.8925 )
									ret := -0.800000 // sell
								if( up > 5.8925 )
									ret := -0.309524
				if( dn > 6.10025 )
					if( up1 <= 7.22211 )
						if( dn1 <= 7.40063 )
							if( dn1 <= 6.34611 )
								if( dn1 <= 6.28845 )
									ret := 0.027638
								if( dn1 > 6.28845 )
									ret := -0.306569
							if( dn1 > 6.34611 )
								if( up1 <= 6.16671 )
									ret := 0.666667
								if( up1 > 6.16671 )
									ret := 0.089558
						if( dn1 > 7.40063 )
							if( up1 <= 7.19034 )
								if( atr2 <= 0.03985 )
									ret := 0.000000
								if( atr2 > 0.03985 )
									ret := -0.250000
							if( up1 > 7.19034 )
								if( dn1 <= 7.40509 )
									ret := 0.933333 // buy
								if( dn1 > 7.40509 )
									ret := 0.438356
					if( up1 > 7.22211 )
						if( up <= 7.49733 )
							if( atr <= 0.028879 )
								if( up <= 7.24977 )
									ret := 0.875000 // buy
								if( up > 7.24977 )
									ret := 0.250000
							if( atr > 0.028879 )
								if( up <= 7.45618 )
									ret := -0.123389
								if( up > 7.45618 )
									ret := -0.475610
						if( up > 7.49733 )
							if( dn1 <= 8.11833 )
								if( dn <= 7.69966 )
									ret := 0.657895
								if( dn > 7.69966 )
									ret := 0.154786
							if( dn1 > 8.11833 )
								if( up1 <= 8.0232 )
									ret := -0.558140
								if( up1 > 8.0232 )
									ret := 0.007958
	if( atr > 0.036125 )
		if( dn <= 7.24082 )
			if( dn <= 6.26244 )
				if( up <= 5.66669 )
					if( atr2 <= 0.064588 )
						if( up <= 4.91299 )
							if( atr <= 0.042757 )
								if( up1 <= 4.87563 )
									ret := 0.750000 // buy
								if( up1 > 4.87563 )
									ret := 1.000000 // buy
							if( atr > 0.042757 )
								if( dn <= 5.12601 )
									ret := 0.500000
								if( dn > 5.12601 )
									ret := 0.250000
						if( up > 4.91299 )
							if( up <= 4.97109 )
								if( dn1 <= 5.24132 )
									ret := -0.533333
								if( dn1 > 5.24132 )
									ret := -1.000000 // sell
							if( up > 4.97109 )
								if( up <= 5.59321 )
									ret := 0.025105
								if( up > 5.59321 )
									ret := -0.435484
					if( atr2 > 0.064588 )
						if( dn <= 5.97016 )
							if( atr <= 0.160913 )
								if( atr <= 0.094141 )
									ret := 0.480000
								if( atr > 0.094141 )
									ret := 0.871429 // buy
							if( atr > 0.160913 )
								if( atr <= 0.182001 )
									ret := -1.000000 // sell
								if( atr > 0.182001 )
									ret := -0.250000
						if( dn > 5.97016 )
							if( dn1 <= 6.10213 )
								if( dn <= 6.00356 )
									ret := -0.090909
								if( dn > 6.00356 )
									ret := -0.709677 // sell
							if( dn1 > 6.10213 )
								if( atr <= 0.115606 )
									ret := 0.581633
								if( atr > 0.115606 )
									ret := -0.152542
				if( up > 5.66669 )
					if( atr2 <= 0.05392 )
						if( atr <= 0.04416 )
							if( up <= 5.74943 )
								if( dn <= 5.9091 )
									ret := 0.000000
								if( dn > 5.9091 )
									ret := 0.637931
							if( up > 5.74943 )
								if( dn1 <= 6.02579 )
									ret := -0.545455
								if( dn1 > 6.02579 )
									ret := 0.251142
						if( atr > 0.04416 )
							if( dn <= 6.1556 )
								if( dn1 <= 6.14876 )
									ret := 0.700730 // buy
								if( dn1 > 6.14876 )
									ret := 0.928571 // buy
							if( dn > 6.1556 )
								if( dn1 <= 6.22879 )
									ret := 0.093458
								if( dn1 > 6.22879 )
									ret := 0.626582
					if( atr2 > 0.05392 )
						if( atr <= 0.060129 )
							if( up1 <= 5.81933 )
								if( atr2 <= 0.057776 )
									ret := 0.681818
								if( atr2 > 0.057776 )
									ret := 0.125000
							if( up1 > 5.81933 )
								if( up <= 5.92321 )
									ret := -0.571429
								if( up > 5.92321 )
									ret := 0.416667
						if( atr > 0.060129 )
							if( atr <= 0.092049 )
								if( up <= 5.86504 )
									ret := 0.257143
								if( up > 5.86504 )
									ret := 0.673469
							if( atr > 0.092049 )
								ret := -0.833333 // sell
			if( dn > 6.26244 )
				if( up1 <= 6.82486 )
					if( up1 <= 6.80857 )
						if( dn1 <= 7.28205 )
							if( up <= 5.66353 )
								if( atr2 <= 0.288433 )
									ret := 0.478788
								if( atr2 > 0.288433 )
									ret := -0.727273 // sell
							if( up > 5.66353 )
								if( atr2 <= 0.109416 )
									ret := 0.128205
								if( atr2 > 0.109416 )
									ret := -0.020548
						if( dn1 > 7.28205 )
							if( up <= 6.76356 )
								if( dn <= 7.23658 )
									ret := -1.000000 // sell
								if( dn > 7.23658 )
									ret := -0.500000
							if( up > 6.76356 )
								ret := -0.250000
					if( up1 > 6.80857 )
						if( up <= 6.84058 )
							if( atr <= 0.052073 )
								if( up1 <= 6.81938 )
									ret := -0.532258
								if( up1 > 6.81938 )
									ret := -0.112903
							if( atr > 0.052073 )
								if( dn1 <= 7.20241 )
									ret := 0.549020
								if( dn1 > 7.20241 )
									ret := -0.714286 // sell
						if( up > 6.84058 )
							if( dn <= 7.15196 )
								if( atr <= 0.043531 )
									ret := 0.000000
								if( atr > 0.043531 )
									ret := 0.600000
							if( dn > 7.15196 )
								if( atr2 <= 0.062534 )
									ret := 0.750000 // buy
								if( atr2 > 0.062534 )
									ret := 1.000000 // buy
				if( up1 > 6.82486 )
					if( atr <= 0.041141 )
						if( up <= 6.83944 )
							if( atr2 <= 0.033635 )
								ret := 0.000000
							if( atr2 > 0.033635 )
								if( atr <= 0.03902 )
									ret := 1.000000 // buy
								if( atr > 0.03902 )
									ret := 0.600000
						if( up > 6.83944 )
							if( atr2 <= 0.033592 )
								if( dn <= 7.22346 )
									ret := 0.666667
								if( dn > 7.22346 )
									ret := 0.000000
							if( atr2 > 0.033592 )
								if( up <= 6.95884 )
									ret := -0.150121
								if( up > 6.95884 )
									ret := 0.112613
					if( atr > 0.041141 )
						if( atr2 <= 0.047097 )
							if( up1 <= 6.94665 )
								if( up <= 6.91696 )
									ret := 0.309598
								if( up > 6.91696 )
									ret := 0.594872
							if( up1 > 6.94665 )
								if( atr <= 0.04294 )
									ret := -0.134615
								if( atr > 0.04294 )
									ret := 0.375000
						if( atr2 > 0.047097 )
							if( dn1 <= 7.16692 )
								if( dn1 <= 7.14953 )
									ret := 0.186813
								if( dn1 > 7.14953 )
									ret := -0.317460
							if( dn1 > 7.16692 )
								if( atr <= 0.056447 )
									ret := 0.206612
								if( atr > 0.056447 )
									ret := 0.404682
		if( dn > 7.24082 )
			if( atr2 <= 0.167376 )
				if( dn <= 20.91 )
					if( up1 <= 6.9984 )
						if( dn <= 7.57721 )
							if( atr2 <= 0.139776 )
								if( dn <= 7.42598 )
									ret := -0.050381
								if( dn > 7.42598 )
									ret := 0.232044
							if( atr2 > 0.139776 )
								if( up <= 6.39933 )
									ret := -0.944444 // sell
								if( up > 6.39933 )
									ret := -0.600000
						if( dn > 7.57721 )
							if( atr <= 0.164716 )
								if( atr2 <= 0.1146 )
									ret := -0.414634
								if( atr2 > 0.1146 )
									ret := -0.793103 // sell
							if( atr > 0.164716 )
								if( dn <= 7.90387 )
									ret := 0.750000 // buy
								if( dn > 7.90387 )
									ret := 1.000000 // buy
					if( up1 > 6.9984 )
						if( up1 <= 7.03002 )
							if( atr2 <= 0.07983 )
								if( dn <= 7.40102 )
									ret := 0.292735
								if( dn > 7.40102 )
									ret := 0.712121 // buy
							if( atr2 > 0.07983 )
								if( atr <= 0.091186 )
									ret := -0.609756
								if( atr > 0.091186 )
									ret := 0.000000
						if( up1 > 7.03002 )
							if( up <= 7.18685 )
								if( atr <= 0.109066 )
									ret := -0.028429
								if( atr > 0.109066 )
									ret := -0.792453 // sell
							if( up > 7.18685 )
								if( up <= 15.2499 )
									ret := 0.049179
								if( up > 15.2499 )
									ret := 0.003976
				if( dn > 20.91 )
					if( dn1 <= 21.0416 )
						if( atr <= 0.108347 )
							if( atr2 <= 0.088722 )
								ret := -1.000000 // sell
							if( atr2 > 0.088722 )
								if( dn1 <= 21.0116 )
									ret := 0.000000
								if( dn1 > 21.0116 )
									ret := -0.250000
						if( atr > 0.108347 )
							if( atr2 <= 0.148 )
								if( dn1 <= 21.0167 )
									ret := -0.733333 // sell
								if( dn1 > 21.0167 )
									ret := -1.000000 // sell
							if( atr2 > 0.148 )
								ret := 0.142857
					if( dn1 > 21.0416 )
						if( atr <= 0.141317 )
							if( atr <= 0.119492 )
								if( atr2 <= 0.094755 )
									ret := -0.584615
								if( atr2 > 0.094755 )
									ret := -0.196721
							if( atr > 0.119492 )
								if( up1 <= 20.5446 )
									ret := 0.775510 // buy
								if( up1 > 20.5446 )
									ret := -0.083333
						if( atr > 0.141317 )
							if( atr <= 0.169976 )
								if( dn1 <= 21.053 )
									ret := 0.250000
								if( dn1 > 21.053 )
									ret := -0.658915
							if( atr > 0.169976 )
								if( dn1 <= 21.1201 )
									ret := 1.000000 // buy
								if( dn1 > 21.1201 )
									ret := 0.100000
			if( atr2 > 0.167376 )
				if( dn <= 21.9995 )
					if( atr2 <= 0.5165 )
						if( up1 <= 8.98709 )
							if( dn <= 9.03841 )
								if( up <= 7.32782 )
									ret := -0.040541
								if( up > 7.32782 )
									ret := 0.605263
							if( dn > 9.03841 )
								if( dn <= 9.30385 )
									ret := -0.241667
								if( dn > 9.30385 )
									ret := -0.616438
						if( up1 > 8.98709 )
							if( dn1 <= 10.9938 )
								if( dn <= 10.5271 )
									ret := -0.142857
								if( dn > 10.5271 )
									ret := 0.921569 // buy
							if( dn1 > 10.9938 )
								if( dn1 <= 18.0285 )
									ret := 0.098367
								if( dn1 > 18.0285 )
									ret := 0.213463
					if( atr2 > 0.5165 )
						if( atr <= 0.694927 )
							if( atr2 <= 0.659591 )
								ret := 1.000000 // buy
							if( atr2 > 0.659591 )
								ret := 0.500000
						if( atr > 0.694927 )
							ret := 0.250000
				if( dn > 21.9995 )
					if( up1 <= 20.3848 )
						if( atr2 <= 0.53837 )
							ret := 0.333333
						if( atr2 > 0.53837 )
							if( atr <= 0.507718 )
								ret := -0.750000 // sell
							if( atr > 0.507718 )
								ret := -0.250000
					if( up1 > 20.3848 )
						if( atr <= 0.24978 )
							if( dn <= 22.0284 )
								ret := -1.000000 // sell
							if( dn > 22.0284 )
								ret := 0.000000
						if( atr > 0.24978 )
							if( up1 <= 20.5686 )
								if( dn <= 22.7227 )
									ret := -0.875000 // sell
								if( dn > 22.7227 )
									ret := -0.500000
							if( up1 > 20.5686 )
								ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator SuperTrend 
//@version=5
//indicator title="Supertrend", overlay=true, format=format.price, precision=2, timeframe="")

Periods = input.int(title="ATR Period", defval=10)
src = input.source(hl2, title="Source")
Multiplier = input.float(title="ATR Multiplier", step=0.1, defval=3.0)
changeATR = input.bool(title="Change ATR Calculation Method?", defval=true)
showsignals = input.bool(title="Show Buy/Sell Signals?", defval=true)
highlighting = input.bool(title="Highlighter On/Off?", defval=true)

atr2 = ta.sma(ta.tr, Periods)
atr = changeATR ? ta.atr(Periods) : atr2

up = src - (Multiplier * atr)
up1 = nz(up[1], up)
up := close[1] > up1 ? math.max(up, up1) : up

dn = src + (Multiplier * atr)
dn1 = nz(dn[1], dn)
dn := close[1] < dn1 ? math.min(dn, dn1) : dn

var trend = 1
trend := nz(trend[1], trend)
trend := trend == -1 and close > dn1 ? 1 : trend == 1 and close < up1 ? -1 : trend

upPlot = plot(trend == 1 ? up : na, title="Up Trend", style=plot.style_linebr, linewidth=2, color=color.green)
dnPlot = plot(trend == 1 ? na : dn, title="Down Trend", style=plot.style_linebr, linewidth=2, color=color.red)

buySignal = trend == 1 and trend[1] == -1
sellSignal = trend == -1 and trend[1] == 1

plotshape(buySignal, title="UpTrend Begins", location=location.absolute, style=shape.circle, size=size.tiny, color=color.green, textcolor=color.white)
plotshape(sellSignal, title="DownTrend Begins", location=location.absolute, style=shape.circle, size=size.tiny, color=color.red, textcolor=color.white)

plotshape(showsignals and buySignal, title="Buy", text="Buy", location=location.absolute, style=shape.labelup, size=size.tiny, color=color.green, textcolor=color.white)
plotshape(showsignals and sellSignal, title="Sell", text="Sell", location=location.absolute, style=shape.labeldown, size=size.tiny, color=color.red, textcolor=color.white)

mPlot = plot(ohlc4, title="", style=plot.style_circles, linewidth=1)

longFillColor = highlighting ? (trend == 1 ? color.new(color.green, 80) : color.new(color.white, 100)) : color.new(color.white, 100)
shortFillColor = highlighting ? (trend == -1 ? color.new(color.red, 80) : color.new(color.white, 100)) : color.new(color.white, 100)

fill(mPlot, upPlot, title="UpTrend Highlighter", color=longFillColor)
fill(mPlot, dnPlot, title="DownTrend Highlighter", color=shortFillColor)

alertcondition(buySignal, title="SuperTrend Buy", message="SuperTrend Buy!")
alertcondition(sellSignal, title="SuperTrend Sell", message="SuperTrend Sell!")
changeCond = trend != trend[1]
alertcondition(changeCond, title="SuperTrend Direction Change", message="SuperTrend has changed direction!")

buySignalInt = buySignal ? 1: 0   //Bool to int
sellSignalInt = sellSignal ? 1: 0   //Bool to int

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
float op_operation = decision_tree_0_LINKUSDT_15Min_75923ed9(dn1, trend, atr, atr2, buySignalInt, sellSignalInt, up1, up, dn)

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


