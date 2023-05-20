package com.example.model

import com.example.model.rp.RpDetailAllModel
import com.example.model.rp.RpDetailModel

fun RpDetailAllModel.mapperToConListModel() : CoinListModel{
    return CoinListModel(
        dataList = ArrayList<CoinListModel.Item>().apply {
            aaveKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "AAVE/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            adaKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "ADA/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            aergoKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "AERGO/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            algoKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "ALGO/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            alphaKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "ALPHA/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            ampKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "AMP/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            apeKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "APE/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            aptKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "APT/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            arKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "AR/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            arbKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "ARB/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            atomKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "ATOM/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            audioKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "AUDIO/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            avaxKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "AVAX/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            axsKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "AXS/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            balKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "BAL/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            bandKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "BAND/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            batKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "BAT/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            bchKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "BCH/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            bitKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "BIT/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            bnbKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "BNB/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            aaveKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "AAVE/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            boraKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "BORA/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            bsvKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "BSV/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            btcKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "BTC/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            bttKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "BTT/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            celoKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "CELO/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            cfgKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "CFG/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            chzKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "CHZ/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            compKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "COMP/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            crvKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "CRV/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            daiKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "DAI/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            dogeKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "DOGE/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            dotKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "DOT/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            dogeKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "DOGE/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            dydxKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "DYDX/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            egldKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "EGLD/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            enjKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "ENJ/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            ensKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "ENS/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            eosKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "EOS/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            etcKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "ETC/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            ethKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "ETH/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            fetKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "FET/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            filKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "FIL/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            flowKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "FLOW/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            ftmKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "FTM/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            galKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "GAL/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            galaKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "GALA/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            gmtKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "GMT/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            gmxKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "GMX/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            gnoKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "GNO/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            grtKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "GRT/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            gtcKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "GTC/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            hbarKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "HBAR/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            hntKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "HNT/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            icpKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "ICP/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            ilvKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "ILV/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            imxKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "IMX/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            inchKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "INCH/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            indexKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "INDEX/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            injKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "INJK/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            kdaKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "KDA/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            klayKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "KLAY/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            ksmKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "KSM/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            kspKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "KSP/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            ldoKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "IDO/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            linkKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "LINK/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            looksKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "LOOKS/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            lptKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "LPT/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            lrcKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "LRC/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            manaKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "MANA/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            maticKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "MATIC/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            medKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "MED/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            minaKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "MINA/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            mkrKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "MKR/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            nearKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "NEAR/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            nptKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "NPT/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            nuKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "NU/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            oceanKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "OCEAN/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            ohmKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "OHM/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            oneKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "ONE/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            opKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "OP/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            osmoKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "OSMO/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            perpKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "PERP/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            poktKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "POKT/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            qtumKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "QTUM/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            rareKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "RARE/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            rariKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "RARI/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            renKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "REN/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            rlyKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "RLY/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            ronKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "RON/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            roseKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "ROSE/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            rplKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "RPL/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            runeKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "RUNE/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            sandKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "SAMD/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            sgbKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "SGB/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            shibKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "SHIB/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            snxKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "SNX/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            solKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "SOL/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            storjKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "STORJ/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            stxKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "STX/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            suiKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "SUI/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            sushiKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "SUSHI/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            synKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "SYN/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            tdropKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "TDROP/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            thetaKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "THETA/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            trxKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "TRX/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            umaKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "UMA/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            uniKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "UNI/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            uniKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "UNI/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            usdcKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "USDC/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            vetKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "VET/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            waxlKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "WAXL/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            waxpKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "WAXP/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            wbtcKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "WBTC/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            xecKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "XEC/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            xlmKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "XLM/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            xplaKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "XPLA/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            xrpKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "XRP/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            xtzKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "XTZ/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            yfiKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "YFI/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            yggKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "YGG/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
            zilKrw.let { it ->
                add(
                    CoinListModel.Item(
                        title = "ZIL/KRW",
                        timestamp = it.timestamp,
                        last = it.last,
                        open = it.open,
                        bid = it.bid,
                        ask = it.ask,
                        low = it.low,
                        high = it.high,
                        volume = it.volume,
                        change = it.change,
                        changePercent = it.changePercent
                    )
                )
            }
        }
    )
}

fun RpDetailModel.mapperToConListModel(title: String) : CoinListModel{
    return CoinListModel(
        dataList = ArrayList<CoinListModel.Item>().apply {
            add(
                CoinListModel.Item(
                    title = "${title}/KRW",
                    timestamp = this@mapperToConListModel.timestamp,
                    last = this@mapperToConListModel.last,
                    open = this@mapperToConListModel.open,
                    bid = this@mapperToConListModel.bid,
                    ask = this@mapperToConListModel.ask,
                    low = this@mapperToConListModel.low,
                    high = this@mapperToConListModel.high,
                    volume = this@mapperToConListModel.volume,
                    change = this@mapperToConListModel.change,
                    changePercent = this@mapperToConListModel.changePercent
                )
            )
        }
    )
}
